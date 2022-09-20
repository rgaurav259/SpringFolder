package com.java.lambdaWithStream;

import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {

        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                return x.compareTo(y);
            }
        };
        System.out.println("comparator  1 is:"+c1.compare(15,10));
        System.out.println("comparator  0 is:"+c1.compare(15,15));
        System.out.println("comparator  -1 is:"+c1.compare(10,15));



        //after java 8
     Comparator<Integer> c2 = Integer::compareTo;
        System.out.println("comparator using lambda is "+c2.compare(4,3));
    }
}
