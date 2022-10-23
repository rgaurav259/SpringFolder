package com.java.sreenuTechDemo;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SequentialStream {
    public static void main(String[] args) {

        //by default arrays.stream return sequential stream
        //arrays.sream or collectionobj.stream()

        //we will create forcefully ParallelStream 
        int[] arr ={10,20,30};
        boolean parallel = Arrays.stream(arr).isParallel();
        System.out.println(" not a parallel stream = " + parallel);

        boolean parallel1 = Arrays.stream(arr).parallel().isParallel();
        System.out.println("this one iis parallel1 = " + parallel1);
    }
}
