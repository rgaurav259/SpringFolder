package com.java.Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List l = new ArrayList<>();
        l.add(100);
        l.add(100);
        l.add(200);
        l.add(300);
        l.add(400);
        l.add(400);
        l.add(400);
        l.add(400);
        l.add(400);
        System.out.println("l = " + l);
        l.add(8,900);
        System.out.println("l = " + l);
        l.add(3,50);
        System.out.println("l = " + l);
        l.set(2,10000);
        System.out.println("l = " + l);
        System.out.println(l.contains(300));
        System.out.println(l.get(2));
        System.out.println(l.indexOf(100));
        System.out.println(l.lastIndexOf(100));
        System.out.println(l.size());
        
        l.clear();
        System.out.println("l = " + l);
    }
}
