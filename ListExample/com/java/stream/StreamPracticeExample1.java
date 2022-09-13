package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamPracticeExample1 {

    public static void main(String[] args) {
        //sum of numbers
        List<Integer> integerList = Arrays.asList(1,4,8,7);
       // Optional<Integer> optionalInteger = integerList.stream().reduce((a, b) -> a + b);

        Optional<Integer> optionalInteger = integerList.stream().reduce(Integer::sum);

        System.out.println("optionalInteger sum is  = " + optionalInteger.get());

        List<Integer> list = Arrays.asList(2,6,8,-2);
        int sum = 0;
        for (Integer num : list) {
            //sum += num; //both are same
            sum = sum + num;
        }
        System.out.println("sum of numbers: " + sum);


        List<Integer>lists = Arrays.asList(1,4,5,6,1,4);
        int sum3 = lists.stream().mapToInt(i -> i).sum();
        System.out.println("Sum of numbers :: " + sum3);
    }
}
