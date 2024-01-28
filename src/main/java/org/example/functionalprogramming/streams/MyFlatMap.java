package org.example.functionalprogramming.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyFlatMap {

    /*flatmap() is used to flatten the data to a single dataType
     * flatmap() returns an arbitrary number of values as the output.
     * */

    private static List<List<Integer>> number = new ArrayList<>();

    static {
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));
    }

    public static void flatMap() {
        /*List<List<Integer>> is flattened to List<Integer>*/
        List<Integer> newList = number.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        newList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        flatMap();
    }
}
