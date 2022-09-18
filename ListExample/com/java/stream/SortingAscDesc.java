package com.java.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingAscDesc {

    public static void main(String[] args) {

        List<Integer> numberss = Arrays.asList(1,2,5,8,3,54,45,12,2,1);

        List<Integer> collects = numberss.stream().sorted().collect(Collectors.toList());

        System.out.println(" by default ascending order sorted = " + collects);

        List<Integer> sorted = numberss.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(" descending reverse sorted = " + sorted);

        List<Integer> listDescendingOrder =  numberss.stream()
                .sorted((a,b)-> -a.compareTo(b))
                .collect(Collectors.toList());
        System.out.println("listDescendingOrder = " + listDescendingOrder);


        List<Integer> list = Arrays.asList(2,  345, -3, 213, 213);

        List<Integer> sortedsss=	list.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        System.out.println(sortedsss);

        List<Integer> sortedrevs=	list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(sortedrevs);


    }

}
