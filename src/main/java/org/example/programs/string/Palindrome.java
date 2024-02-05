package org.example.programs.string;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        StringBuilder input = new StringBuilder(word);
        input.reverse();
        return input.toString().equals(word);
    }

    public static boolean isPalindromeUsingPointers(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left++) != word.charAt(right--)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println("Result : " + isPalindrome("madam"));
        System.out.println("Result : " + isPalindromeUsingPointers("madam"));
    }
}
