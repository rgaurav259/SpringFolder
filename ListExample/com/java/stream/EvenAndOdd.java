package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenAndOdd {
    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 8, 7, 8, 9, 4, 1, 2, 3);
//
//        List<Integer> sum = list.stream().filter(x -> x % 2 == 0)
//
//                .collect(Collectors.toList());
//        System.out.println("sum = " + sum);


        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 8, 7, 8, 9, 4, 1, 2, 3);


        Map<Boolean, List<Integer>> newcollecteditems = numberList.stream()
                .collect(Collectors.partitioningBy(i -> (i & 1) == 0));
        System.out.println("newcollecteditems = " + newcollecteditems);

    }
}

