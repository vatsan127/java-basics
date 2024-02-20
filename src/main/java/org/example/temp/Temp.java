package org.example.temp;

import java.util.Arrays;
import java.util.List;

public class Temp {

    public static void main(String[] args) {
        String[] nameList = {" Steve", " Vatsan"};
        List<String> newList = Arrays.stream(nameList)
                .map(String::trim)
                .toList();
        newList.forEach(str -> System.out.print("'" + str + "'"));
    }
}