package org.example.programs.string;

public class ReverseString {

    public static void reverseString() {
        String inputString = "Hello";
        StringBuilder result = new StringBuilder();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            result.append(inputString.charAt(i));
        }
        System.out.println("Result : " + result);
    }

    public static void main(String[] args) {
        reverseString();
    }
}
