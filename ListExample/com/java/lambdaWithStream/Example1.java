package com.java.lambdaWithStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Example1 {
    public static void main(String[] args) {

        //before java8
        int total =0;
        for (int i =0;i <= 50;i++){
            total=total+i;
        }
        System.out.println("total = " + total);

        //after lambda
        int num = IntStream.rangeClosed(0,50)
                .sum();

        System.out.println("num = " + num);

        List<String> names = Arrays.asList("sam","peter","peter","bilings","sam");
        //before java 8
        
        List<String> uniqueList = new ArrayList<>();
        for (String name:names){
            if (!uniqueList.contains(name)){
                uniqueList.add(name);
            }
        }
        System.out.println("uniqueList = " + uniqueList);
        
        //now java 8 using
        HashSet<String> strings = new HashSet<>(names);
        System.out.println("strings = " + strings);

        List<String> newlist = names.stream().distinct().collect(Collectors.toList());
        System.out.println("newlist = " + newlist);


    }
}
