package com.java.Demo;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList l=new LinkedList<>();
        l.add("gaurav");
        l.add(null);
        l.add("gaurav");
        System.out.println("l = " + l);
        l.set(0,"software");
        System.out.println("l = " + l);
        l.set(0,"venky");
        System.out.println("l = " + l);
        l.removeLast();
        System.out.println("l = " + l);
        l.removeFirst();
        System.out.println("l = " + l);
        l.addFirst("CCCCCCCCC");
        System.out.println("l = " + l);

        
    }
}
