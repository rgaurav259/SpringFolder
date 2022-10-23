package com.java.sreenuTechDemo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToListConversion {
    public static void main(String[] args) {
        Map<Integer,String> mappp = new HashMap<>();
        mappp.put(2,"C");
        mappp.put(1,"B");
        mappp.put(3,"A");
        mappp.put(4,"D");

        List<Integer> collect = mappp.keySet().stream().collect(Collectors.toList());
        System.out.println("collected key  = " + collect);
        List<String> collect1 = mappp.values().stream().collect(Collectors.toList());
        System.out.println("collected value = " + collect1);
    }
}
