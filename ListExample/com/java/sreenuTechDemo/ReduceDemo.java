package com.java.sreenuTechDemo;

import java.util.*;
import java.util.stream.Collectors;

public class ReduceDemo {
    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(70);
        al.add(90);

        //using stream method reference print all value
        al.stream().forEach(System.out::println);
        //al.forEach(System.out::println);

        //convert array to stream aarray and object
        Object[] objects = al.stream().toArray();
        for (Object o : objects){
            System.out.print(o+ " ");
        }
        System.out.println();
        //using stream 2 value added
        Optional<Integer> integer = al.stream().reduce((a, b) -> a + b);
        System.out.println(integer.get());
        //count

        long count = al.stream().count();
        System.out.println("count = " + count);

        //max
        Optional<Integer> max = al.stream().max(Integer::compareTo);
        Optional<Integer> maxxx = al.stream().max((a, b) -> a.compareTo(b));
        System.out.println("max number is  = " + max.get());
        System.out.println("max number is using method reference  = " + maxxx.get());

        //convert list to map /set /or list as well
        List<Integer> collect = al.stream().distinct().collect(Collectors.toList());
        System.out.println("collect list = " + collect);
        Set<Integer> collect1 = al.stream().distinct().collect(Collectors.toSet());
        System.out.println("collect1 set list convert = " + collect1);

        //find first any match non match

        Integer integer1 = al.stream().findFirst().get();
        System.out.println("find first = " + integer1);

       List<String> str =  Arrays.asList("gurav","saurav","gautam","java","python");
        System.out.println("str = " + str);
        boolean gaurav = str.stream().anyMatch(x -> x.startsWith("saurav"));
        System.out.println("gaurav = " + gaurav);


    }
}
