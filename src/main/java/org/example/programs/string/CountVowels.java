package org.example.programs.string;

import java.util.function.Predicate;

public class CountVowels {
    public static void countVowels(String str) {
        int count = 0;
        String vowles = "aeiou";
        Predicate<Character> checkVowels = letter ->
                vowles.contains(Character.toString(letter).toLowerCase());
        for (char letter : str.toCharArray()) {
            if (checkVowels.test(letter)) {
                count++;
            }
        }
        System.out.println("Count : " + count);
    }

    public static void main(String[] args) {
        String str = "Hello";
        countVowels(str);
    }
}
