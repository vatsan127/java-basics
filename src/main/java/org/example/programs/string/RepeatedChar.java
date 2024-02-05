package org.example.programs.string;

import java.util.HashMap;
import java.util.Map;

public class RepeatedChar {
    public static void repeatedChar(String str) {
        Map<Character, Integer> frequencies = new HashMap<>();
        for (char ch : str.toLowerCase().toCharArray()) {
            if (frequencies.containsKey(ch)) {
                frequencies.replace(ch, frequencies.get(ch) + 1);
            } else
                frequencies.put(ch, 1);
        }
        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            System.out.println("char : " + entry.getKey() + " count : " + entry.getValue());
        }
    }

    public static void repeatedCharWithAscii(String str) {
        final int ASCII_SIZE = 256;
        int[] freInts = new int[ASCII_SIZE];
        for (char ch : str.toCharArray()) {
            freInts[ch]++;
        }
        int max = 0;
        char result = ' ';
        for (int i = 0; i < freInts.length; i++) {
            if (freInts[i] > max) {
                max = freInts[i];
                result = (char) i;
            }
        }
        System.out.println("max Element : " + result);
    }

    public static void main(String[] args) {
        repeatedChar("HeLLo Google");
        repeatedCharWithAscii("HeLLo Google");

    }
}
