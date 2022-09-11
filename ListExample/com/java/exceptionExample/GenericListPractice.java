package com.java.exceptionExample;

import java.util.ArrayList;
import java.util.List;

public class GenericListPractice <T> {
    //create a method which accepts tge generic type of  list

    public static void main(String[] args) {

//        List<String> input = new ArrayList<>();
//        input.add("Jack");
//        input.add("Jim");
//        input.add("Johnacharya");

//        List<Integer> size = new GenericListPractice().getSize(input);
//        System.out.println("size = " + size);


        List<Integer> input1 = new ArrayList<>();
        input1.add(56566);
        input1.add(55);
        input1.add(550000000);
        input1.add(5055555);

        List<Integer> out1 =new GenericListPractice().getSize(input1);
        System.out.println("out1 size is  = " + out1);

    }

    public List<Integer> getSize(List<T> list){
        List<Integer> output = new ArrayList<>();
        for (T l : list){
            output.add(l.toString().length());
        }
        return output;

    }
}
