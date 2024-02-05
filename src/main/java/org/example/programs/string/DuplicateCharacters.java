package org.example.programs.string;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class DuplicateCharacters {
    /*Remove duplicate characters in a String*/
    public static void duplicate() {
        String inputSrting = "hello";

        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        Predicate<Character> predicate = c -> seen.contains(c);

        for (char c : inputSrting.toCharArray()) {
            if (!predicate.test(c)) {
                seen.add(c);
                result.append(c);
            }
        }
        System.out.println("Result : " + result);

    }

    public static void main(String[] args) {
        duplicate();
    }
}
