package org.example.functionalprogramming.streams;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreams {
    /*representing primitive values in Streams*/
    public static void numericStreams() {
        /*Operations
         * range(1,6) -> 1,2,3,4,5
         * rangeClosed(1,6) -> 1,2,3,4,5,6
         *
         * sum()
         * max()
         * min()
         * average()
         * */
        IntStream intStream = IntStream.range(1, 6);
        /*OptionalInt result = intStream.reduce((a, b) -> a + b);*/
        int result = intStream.sum();
        System.out.println("Sum : " + result);

        IntStream intStream2 = IntStream.rangeClosed(1, 6);
        OptionalInt maxResult = intStream2.max();
        if (maxResult.isPresent()) {
            System.out.println("max Result : " + maxResult.getAsInt());
        }

        IntStream intStream3 = IntStream.rangeClosed(99, 100);
        OptionalInt minResult = intStream3.min();
        if (minResult.isPresent()) {
            System.out.println("min Result : " + minResult.getAsInt());
        }

        IntStream intStream4 = IntStream.rangeClosed(99, 100);
        OptionalDouble averageResult = intStream4.average();
        if (averageResult.isPresent()) {
            System.out.println("Average Result : " + averageResult.getAsDouble());
        }

        /*Boxing
         * converting a primitive type to Wrapper Class type
         *
         * UnBoxing
         * converting a Wrapper Class to primitive type
         * */

        IntStream intStream5 = IntStream.rangeClosed(99, 100);
        List<Integer> intList = intStream5.boxed().collect(Collectors.toList());
        System.out.println("Boxing (int to Integer List) : " + intList);

        int sum = intList.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("UnBoxing (Integer List to int) : " + sum);

    }

    public static void main(String[] args) {
        numericStreams();
    }
}
