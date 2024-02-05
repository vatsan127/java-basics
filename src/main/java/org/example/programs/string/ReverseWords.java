package org.example.programs.string;

public class ReverseWords {
    public static void reverseWords() {
        String inputString = "Hey Google! ";
        StringBuilder result = new StringBuilder();

        String[] strArr = inputString.split(" ");
        for (int i = strArr.length - 1; i >= 0; i--) {
            result.append(strArr[i] + " ");
        }
        System.out.println("Result : " + result);
    }

    public static void main(String[] args) {
        reverseWords();
    }
}
