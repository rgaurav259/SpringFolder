package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GetSkipLimit {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,4,1,2,5,5,5,9,12,10);

        List<Integer> collect = integers.stream().limit(5).skip(3).collect(Collectors.toList());

        System.out.println("collect = " + collect);
        
        //now first five numbers add only

        //int addded = integers.stream().limit(5).reduce((a, b) -> a + b).get();

        int addded = integers.stream().limit(5).reduce(Integer::sum).get();
        System.out.println("addded range variable maximum 5 value upto in a list and then add = " + addded);


        Integer integer = integers.stream().skip(5).reduce(Integer::sum).get();
        System.out.println("skip 5 value and add the integer = " + integer);
        
        //now skip range to limit and add
        Integer integer1 = integers.stream()
                .limit(5)
                .skip(1)
                .reduce(Integer::max)
                .get();

        System.out.println("integer1 = " + integer1);


    }    
    
}
