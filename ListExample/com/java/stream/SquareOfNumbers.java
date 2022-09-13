package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,5,16);
        List<Integer> collect = list.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println("collect = " + collect);
        
        //now i want to filter only greater than 100
        
        List<Integer> filteredvalue = collect.stream().filter(x -> x > 100).collect(Collectors.toList());
        System.out.println("filteredvalue = " + filteredvalue);
        
        //if we both results same line
        List<Integer> collect1 = list.stream().map(x -> x * x).filter(x -> x > 100).collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);


        //now i wnat to filter average sqauare

        List<Integer> listss = Arrays.asList(1,5,16,8,7);
        double asDouble = listss.stream()
                .map(e -> e * e)
                .filter(e -> e > 100)
                .mapToInt(e -> e)
                .average().getAsDouble();

        System.out.println("asDouble  average is = " + asDouble);

    }
}
