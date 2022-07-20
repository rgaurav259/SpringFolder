package com.java.Demo;

import java.util.Comparator;
import java.util.TreeSet;


public class ComparataorDemo implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1= (String) o1;//we have to typecaste ,but string has also facility tostring we can use
        String s2= o2.toString();
        //return s1.compareTo(s2);//it will print ascending order
        //return -s1.compareTo(s2);//it will print descending order
        return s2.compareTo(s2);//it will print only one value rest will be duplicate because return 0


    }
    
    
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new ComparataorDemo());//if we trying to our own customized method then we have to pass as an argument of object ComparatorDemo
        t.add("Roja");
        t.add("ShobhaRani");
        t.add("rajakumari");
        t.add("gangabhawani");
        t.add("ramulamma");
        System.out.println("t = " + t);//by default asc order it will stored in memory
        
    }

   
}
