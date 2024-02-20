package org.example.programs.string;


import java.util.ArrayList;
import java.util.List;

public class ShortestDistance {
    /*Shortest distance to every other character from given character
     * 0 1 2 3 4 5 6
     * A B C D E F C
     *
     * I I 0 1 2 3 4
     * 2 1 0 1 2 1 0
     * */

    public static void solution(char[] charArr, int x) {
        int length = charArr.length;
        int prev = Integer.MAX_VALUE;
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (charArr[i] == x) {
                prev = i;
            }
            if (prev == Integer.MAX_VALUE) {
                arrList.add(prev);
            } else {
                arrList.add(Math.abs(prev - i));
            }
        }
        for (int i = length - 1; i >= 0; i--) {
            if (charArr[i] == x) {
                prev = i;
            }
            if (prev != Integer.MAX_VALUE) {
                arrList.set(i, Math.min(arrList.get(i), Math.abs(prev - i)));
            }
        }
        System.out.println(arrList);
    }

    public static void main(String[] args) {
        char[] charArr = {'A', 'B', 'C', 'D', 'E', 'F', 'C'};
        solution(charArr, 'C');
    }
}