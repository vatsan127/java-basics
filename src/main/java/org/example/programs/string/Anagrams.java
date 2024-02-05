package org.example.programs.string;

import java.util.Arrays;

public class Anagrams {
    public static Boolean checkAnagrams() {
        String str1 = "ABCD";
        String str2 = "CDAB";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static boolean checkAnagramsUsingHistogramming() {
        String str1 = "ABCD";
        String str2 = "CDAB";

        final int ALPHABETSIZE = 26;
        int[] frequencies = new int[ALPHABETSIZE];

        str1 = str1.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            int index = str1.charAt(i) - 'a';
            frequencies[index]++;
        }

        str2 = str2.toLowerCase();
        for (int i = 0; i < str2.length(); i++) {
            int index = str2.charAt(i) - 'a';
            if (frequencies[index] == 0) {
                return false;
            }
            frequencies[index]--;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println("Result : " + checkAnagrams());
        System.out.println("Result : " + checkAnagramsUsingHistogramming());

    }
}
