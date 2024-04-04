package org.example;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class Main {
    public static String expression = "(#co('@Reply Listener:SOURCE_NUMBER@','ANY','1136')>0) && (#co('@Reply Listener:SHORT_MESSAGE@','LIKE','%12 OP%')>0)?'true':'false'";
    public static String shortMessage = "12 OP";
    public static String ofrReply = "1GB";

    public static void main(String[] args) {
        {
            boolean isMatch = true;
            log.info("zkhr :: MoveCustomerService :: validateRuleResult :: expression :: {} ", expression);
            List<String> replyKeywordList = new ArrayList<>();
            String[] expArr = expression.split("&&");
            expression = expArr[expArr.length - 1];
            String regex = "'(.*?)'";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(expression);
            List<String> patternList = new ArrayList<>();
            while (matcher.find()) {
                patternList.add(matcher.group(1));
            }
            if (!patternList.isEmpty()) {
                replyKeywordList = (Arrays.asList(patternList.get(2).replaceAll("%", "").split("~")));
            }

            log.info("zkhr :: MoveCustomerService :: validateRuleResult :: shortMessage :: {} ", shortMessage);
            log.info("zkhr :: MoveCustomerService :: validateRuleResult :: replyKeywordList :: {} ", replyKeywordList);
            for (String ternExpReplyKeyword : replyKeywordList) {
                ternExpReplyKeyword = ternExpReplyKeyword.replaceAll("%", "");
                if (shortMessage.toLowerCase().contains(ternExpReplyKeyword.toLowerCase())) {
                    isMatch = isReplyListenerValid(shortMessage, ternExpReplyKeyword);
                    break;
                }
            }
            log.info("IsMatch :: {}", isMatch);
        }
    }

    public static boolean isReplyListenerValid(String shortMessage, String ternExpReplyKeyword) {

        List<String> replyKeywordList = Arrays.asList(ofrReply);
        for (String replyKeyword : replyKeywordList) {
            if (ternExpReplyKeyword.equalsIgnoreCase(replyKeyword)) {
                return true;
            }
        }

        return false;
    }


}
