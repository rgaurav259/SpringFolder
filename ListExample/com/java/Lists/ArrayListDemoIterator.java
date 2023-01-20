package com.java.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemoIterator {
    public static void main(String[] args) {
        List l2 = new ArrayList<>();
        l2.add(100);
        l2.add(500);
        l2.add(600);

        //iteratre the value
        Iterator iterator = l2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //list iterator approach
        ListIterator listIterator = l2.listIterator();
        while (listIterator.hasNext()){
            System.out.print("listIterator.next() = " + listIterator.next()+" ");
            //System.out.println("listIterator.next() = " + listIterator.previous());
        }
        System.out.println();

        //using lambda foreach
        l2.forEach(i-> {
            System.out.println("i = " + i);
        });
    }
}
