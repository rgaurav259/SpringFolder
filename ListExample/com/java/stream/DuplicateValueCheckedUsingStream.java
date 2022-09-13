package com.java.stream;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateValueCheckedUsingStream {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 8, 7, 8, 9, 4,2,1,6, 1, 2, 3);
        //find duplicate

        Set<Integer> collect = numberList.stream()
                .filter(e -> Collections.frequency(numberList, e) > 1)
                .collect(Collectors.toSet());
        System.out.println("collect = " + collect);

        Set<Integer> dupNum = new HashSet<>();
        Set<Integer> collect1 = numberList.stream()
                .filter(e -> !dupNum.add(e)).collect(Collectors.toSet());
        System.out.println("collect1 = " + collect1);

    }
}
