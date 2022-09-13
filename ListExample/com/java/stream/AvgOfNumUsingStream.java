package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class AvgOfNumUsingStream {

    public static void main(String[] args) {
        //using stream
        List<Integer> list = Arrays.asList(1,2,3);
        double asDouble = list.stream().mapToInt(x -> x).average().getAsDouble();
        System.out.println("asDouble value = " + asDouble);

//traditional way

//        List<Integer> lists = Arrays.asList(2,5,8,5);
//        int sum = 0, total = 0, average = 0;
//        for (Integer num : lists) {
//            sum = sum + num;
//            total ++;
//            average = sum / total;
//        }
//        System.out.println("Average of numbers: " + average);
    }



}
