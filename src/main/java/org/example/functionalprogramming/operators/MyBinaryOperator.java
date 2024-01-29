package org.example.functionalprogramming.operators;

import java.util.function.BinaryOperator;

public class MyBinaryOperator {
    /* used when  the two arguments are of same Type and output is also of sameType */

    public static void binaryOperator() {
        BinaryOperator<Integer> operator = (a, b) -> a + b;
        System.out.println(operator.apply(2, 3));
    }

    public static void main(String[] args) {
        binaryOperator();
    }
}
