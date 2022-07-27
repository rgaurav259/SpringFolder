package com.java.Stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamForeach {
    public static void main(String[] args) {
        ArrayList<Integer> al =new ArrayList<>();
        al.add(10);
        al.add(0);
        al.add(15);
        al.add(20);
        al.add(8);
        System.out.println("al = " + al);
        Consumer<Integer> c =i->{
            System.out.println("The square of " + i + " is " + (i*i));

        };
        al.stream().forEach(c);

        System.out.println("-----------");
        //we can directly add
        al.stream().forEach(i->{
            System.out.println("The square of " + i + " is " + (i*i));

        });
        
        
        
        //------------------     toArray() -------------------

        Integer[] array = al.stream().toArray(Integer[]::new);

        System.out.println("--------------");
        for (Integer arr:array) {
            System.out.println("arr = " + arr);
            
        }
        //2nd way print
        Stream.of(array).forEach(System.out::println);

    }
}
