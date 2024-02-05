package org.example.programs.string;

import java.util.function.BiPredicate;

public class StringRotations {
    /*
     * ABCD -> DABC
     *         CDAB
     *         BCDA
     *         ABCD
     * ABCDABCD
     * */

    public static Boolean stringRotations() {
        String inputStr1 = "ABCD";
        String inputStr2 = "BCDA";

        BiPredicate<String, String> checkLength = (str1, str2) -> str1.length() == str2.length();
        BiPredicate<String, String> checkContains = (str1, str2) -> (str1 + str1).contains(str2);

        if (!checkLength.test(inputStr1, inputStr2)) {
            return false;
        }

        if (!checkContains.test(inputStr1, inputStr2)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Result : " + stringRotations());
    }
}
