package com.java.InterviewRelated;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merge2List {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,5,7,8,9);
        List<Integer> list2 = Arrays.asList(1,2,7,47,88,9);

        Set<Integer> collectlist = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toSet());
        System.out.println("integers = " + collectlist);

        Optional<Integer> min = collectlist.stream().min(Integer::compareTo);
        System.out.println("min.get() = " + min.get());


    }
}
