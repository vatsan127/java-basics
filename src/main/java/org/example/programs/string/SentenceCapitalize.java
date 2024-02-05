package org.example.programs.string;

public class SentenceCapitalize {
    public static void capitalize() {
        String sentence = "hey google";
        String[] words = sentence
                .trim()
                .replaceAll(" +", " ")
                .split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase()
                    + words[i].substring(1).toLowerCase();
        }
        System.out.println(String.join(" ", words));
    }

    public static void main(String[] args) {
        capitalize();
    }
}
