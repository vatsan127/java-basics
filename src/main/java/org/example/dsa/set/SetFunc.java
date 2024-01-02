package org.example.dsa.set;

import java.util.HashSet;
import java.util.Set;

public class SetFunc {
    public static void main(String[] args) {
        /*Unordered Unique set of collection*/
        Set<String> stringSet = new HashSet<>();

        /*to add values*/
        stringSet.add("naruto");
        stringSet.add("sasuke");
        stringSet.add("sasuke");
        stringSet.add("minato");
        stringSet.add("hinata");

        /*to remove a value from set*/
        stringSet.remove("minato");

        /*to print set using forEach*/
        stringSet.forEach(value -> {
            System.out.println(value);
        });

        /*to remove all values that is in another collection*/
        stringSet.removeAll(stringSet);

    }
}
