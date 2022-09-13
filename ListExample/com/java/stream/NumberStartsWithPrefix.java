package com.java.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumberStartsWithPrefix {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(222,-2,242,124,45,44,58,257);

        List<Integer> collect = numbers.stream()
                .map(e -> String.valueOf(e))
                .filter(e -> e.startsWith("2"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println("collect = " + collect);

        //also negative number then i will use



        //without lambda
//        List<Integer> startWithTwo = Arrays.asList(2,222,234,567,432,236,211,22);
//
//        for (int i = 0; i <startWithTwo.size() ; i++) {
//             String str = String.valueOf(startWithTwo.get(i));
//
//            System.out.print( str + " ");
//        }

    }
}
