package com.java.Generics;

public class Genericmain {
    public static void main(String[] args) {

        //only we can pass value that is only number not string or any types
        GenericBoundsType<Integer> gd = new GenericBoundsType<>(10);
        gd.print();
        GenericBoundsType<Double> doubleee = new GenericBoundsType<>(10.0);
        doubleee.print();
        GenericBoundsType<Long> gds = new GenericBoundsType<>(55588L);
        gds.print();

    }
}
