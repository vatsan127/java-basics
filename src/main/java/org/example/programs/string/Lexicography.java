package org.example.programs.string;

import java.util.HashMap;
import java.util.Map;

public class Lexicography {
    public static String getSmallestAndLargest(String s, int k) {
        int stringLength = s.length();

        /*
        int arrLength = stringLength - 2;
        String arr[] = new String[arrLength];
        */

        int condition = stringLength - k + 1;
        /*
        for (int i = 0; i < condition; i++) {
            arr[i] = s.substring(i, i + k);
        }
        Arrays.sort(arr);
        */

        String min = s.substring(0, k);
        String max = "";
        for (int i = 0; i < condition; i++) {
            String c = s.substring(i, i + k);
            if (min.compareTo(c) > 0)
                min = c;
            if (max.compareTo(c) < 0)
                max = c;
        }

        return min + "\n" + max;
//        return arr[0] + "\n" + arr[arrLength - 1];
    }

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }
}
