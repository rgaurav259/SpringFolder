package com.java.sreenuTechDemo;

import java.util.*;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer,String> mappp = new HashMap<>();
        mappp.put(2,"C");
        mappp.put(1,"B");
        mappp.put(3,"A");
        mappp.put(4,"D");
        System.out.println("mappp = " + mappp);
        System.out.println(mappp.keySet());
        System.out.println(mappp.containsKey(2));
        System.out.println(mappp.entrySet().stream().collect(Collectors.toList()));

        mappp.keySet().stream().forEach(System.out::println);

        System.out.println();
        //only value pring
        mappp.values().stream().forEach(System.out::println);
        //both value and keys

        mappp.entrySet().stream().forEach(System.out::println);

        //sort the data bases on key ascending order
        mappp.keySet().stream().sorted().forEach(System.out::println);

        //descending order
        mappp.keySet().stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        //another way to reverse descending

        mappp.entrySet().stream().sorted(Map.Entry.comparingByKey(Collections.reverseOrder())).forEach(System.out::println);

        System.out.println();
        //another way to reverse ascending
        mappp.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);


    }
}
