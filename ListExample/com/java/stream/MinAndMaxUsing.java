package com.java.stream;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class MinAndMaxUsing {
    public static void main(String[] args) {
//        print different ways to find max min
        List<Integer> number = Arrays.asList(1,1,3,4,5,677,8,8,6,44,55,46);
        //find max
        Integer integer = number.stream()
                .max(Comparator.comparing(Integer::valueOf)).get();

        System.out.println("maximum number is  = " + integer);
        
        //we can also using lambda
        int result = number.stream().max((e1,e2) -> e1-e2).get();
        //int results = number.stream().min((e1,e2) -> e1-e2).get();
        int results = number.stream().min(Comparator.comparingInt(e -> e)).get();

        System.out.println("results minimum is  = " + results);
        System.out.println("result  mqximum is = " + result);


        List<Integer> list1 = Arrays.asList(-1,0,1,3,10,20,30,15,1,13,1,2,2,10,40,19,3);
        Integer maxnum = list1.stream().reduce(1, (a, b) -> a > b ? a : b);
        System.out.println(maxnum);
        Integer minnum = list1.stream().reduce(1, (a, b) -> a < b ? a : b);
        System.out.println(minnum);


        IntSummaryStatistics collect  = number.stream().collect(summarizingInt(e->e));
        System.out.println("collect = " + collect);


        IntSummaryStatistics collect1 = list1.stream().collect(summarizingInt(x -> x));
        System.out.println("collect1 = " + collect1);

//    output is :
//        collect = IntSummaryStatistics{count=12, sum=858, min=1, average=71.500000, max=677}
//        collect1 = IntSummaryStatistics{count=17, sum=169, min=-1, average=9.941176, max=40}

    }
}
