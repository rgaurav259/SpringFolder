package com.java.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        List l1 = new ArrayList<>();
        l1.add(100);
        l1.add(200);
        l1.add(300);
        l1.add(600);
        System.out.println("l1 = " + l1);

        List l2 = new ArrayList<>();
        l2.add(100);
        l2.add(500);
        l2.add(600);
//        l2.addAll(l1);

        //iteratre the value
        Iterator iterator = l2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



        System.out.println("l2 = " + l2);
        //output is l2 = [400, 500, 600, 100, 200, 300]
        //retain all .method keep common and delete all
         l2.retainAll(l1);
        System.out.println(l2);




    }
}
