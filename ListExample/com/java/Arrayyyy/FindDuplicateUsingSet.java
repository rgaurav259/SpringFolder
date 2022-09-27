package com.java.Arrayyyy;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateUsingSet {
    public static void main(String[] args) {
        int [] inputArr = {10,5,10,34,24,24,70,100,100,102,100};

        Set<Integer> newslist = new HashSet<>();
        for (Integer number:inputArr) {
            if (!newslist.add(number)){
                System.out.println(number);
            }


        }

    }
}
