package com.java.sreenuTechDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IntermediateOperation {
    public static void main(String[] args) {


        //intermediate operations will produce stream
        //filter map sorted skip limit various method
        //now collectionobj to stream converting

        //remove null values from arraylist
        List<String> str = new ArrayList<>();
        str.add("A");
        str.add("B");
        str.add("A");
        str.add("B");
        str.add("C");
        str.add("Z");
        str.add("B");
        str.add("K");

        str.add(null);
        str.stream().filter(x ->x!=null).distinct().sorted().forEach(System.out::print);
        System.out.println();
        str.stream().filter(Objects::nonNull).distinct().forEach(System.out::print);

        System.out.println();

        //now i want to convert lowercas and upercase
        str.stream().
                filter(x ->x!=null)
                .map(y->y.toLowerCase()).
                distinct().sorted()
                .forEach(System.out::print);


    }
}
