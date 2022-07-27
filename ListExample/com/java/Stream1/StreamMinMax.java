package com.java.Stream1;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamMinMax {
    public static void main(String[] args) {

        ArrayList<Integer> al =new ArrayList<>();
        al.add(10);
        al.add(0);
        al.add(15);
        al.add(20);
        al.add(8);
        System.out.println("al = " + al);

        //for each element prints  this way also
        al.stream().forEach(System.out::println);
        System.out.println("------------------------------------");
        // this way also 
        for(Integer newvalue :al) System.out.println(newvalue);
        //-------------------
        //Integer maxvalue = al.stream().max((i1, i2) -> i1.compareTo(i2)).get();

        Integer maxvalue = al.stream().max(Integer::compareTo).get();
        Integer maxvalue1 = al.stream().max(Comparator.naturalOrder()).get();
        
        Integer minvalue= al.stream().min(Integer::compareTo).get();
        System.out.println("minvalue = " + minvalue);

        System.out.println("maxvalue1 = " + maxvalue1);
        System.out.println("maxvalue = " + maxvalue);

        // there are various possible ways to sorting the value


    }
}
