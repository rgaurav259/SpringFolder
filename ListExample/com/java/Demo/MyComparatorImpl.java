package com.java.Demo;

import java.util.TreeSet;

public class MyComparatorImpl {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator());//if not passing as argument then jvm will call default
        //sorting order merhod that is compareTo method and it will print ascendign order
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
        System.out.println(t); //by default it will print ascending order [0, 5, 10, 15, 20] but after pass as an
        //an Mycomparator object to parameter of treeset it will work or own customized methods.



    }


}
