package com.java.Demo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet h = new HashSet<>();
        h.add("A");
        h.add("B");
        h.add("C");
        h.add(null);// only one null allowed
        System.out.println(h.add(null));//false
        h.add(10);
        System.out.println(h.add("A"));//duplicates not allowed ,it will not throw any error .it will just return boolean false

        System.out.println(h);//insertion order not preserved


        LinkedHashSet lh = new LinkedHashSet();
        lh.add("A");
        lh.add("B");
        lh.add("C");
        lh.add(null);// only one null allowed
        System.out.println(lh.add(null));//false
        lh.add(10);
        System.out.println(lh.add("A"));//duplicates not allowed ,it will not throw any error .it will just return boolean false

        System.out.println(lh);//insertion order  preserved  because linkedlist + hashtable it will followed
    }
}
