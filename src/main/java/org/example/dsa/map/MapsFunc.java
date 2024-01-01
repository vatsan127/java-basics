package org.example.dsa.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapsFunc {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        /*to add entries in map*/
        map.put(9800, "Minato");

        /*to get a data from map*/
        System.out.println("map data : " + map.get(9800));

        /*to check whether an data is present by key*/
        System.out.println("check whether data is present : " + map.containsKey(9800));

        /*to put an data... only if its not present */
        map.putIfAbsent(9800, "Naruto");

        /*to replace an value in a key ... only if the key is present*/
        map.replace(9800, "Sasuke");

        System.out.println("Map after replace " + map.get(9800));

        Map<Integer, String> map1 = new HashMap();

        /*to pull all the values of a map to another map*/
        map1.putAll(map);

        /*to traverse through a Map using forEach*/
        System.out.println("Using forEach");
        map1.forEach((key, value) -> {
            System.out.println("Key : " + key + " value : " + value);
        });

        /*to traverse through a Map using EntrySet*/
        System.out.println("Using EntrySet");
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
        }

        /*to traverse through a Map using Iterator*/
        System.out.println("Using Iterator");
        Iterator<Map.Entry<Integer, String>> iterator = map1.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
        }
    }
}
