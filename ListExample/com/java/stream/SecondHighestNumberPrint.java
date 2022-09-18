package com.java.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestNumberPrint {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1,2,2,5,8,4,8);
      int secondHighestNumber =  num.stream()
                .sorted(Collections.reverseOrder())
                .distinct()
                .limit(2)
                .skip(1)
                .findFirst().get();
        System.out.println("secondHighestNumber = " + secondHighestNumber);

        int thirddHighestNumbers =  num.stream()
                .sorted(Collections.reverseOrder())  //reverese 8,8,5....
                .distinct()//and then distinct remove duplicate
                .skip(2)     ////and then skip first highest
                .findFirst()
                .get();

        System.out.println("secondHighestNumber = " + thirddHighestNumbers);
        
        //second lowesr numberss....................
        Integer secondlowest = num.stream().sorted()
                .distinct()
                .skip(1)
                .findFirst()
                .get();

        System.out.println("secondlowest = " + secondlowest);
    }
}
