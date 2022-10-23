package com.java.sreenuTechDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LimitSkipDemo {
    public static void main(String[] args) {

        List<String> str = new ArrayList<>();
        str.add("A");
        str.add("B");
        str.add("A");
        str.add("B");
        str.add("C");
        str.add("Z");
        str.add("B");
        str.add("K");
        List<String> collect = str.stream().limit(3).collect(Collectors.toList());
        System.out.println("collect = " + collect);
        str.stream().limit(4).forEach(System.out::print);
        System.out.println();

        //skip first 2 elements
        str.stream().skip(2).limit(2).forEach(System.out::print);
    }
}
