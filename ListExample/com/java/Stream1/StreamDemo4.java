package com.java.Stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo4 {
    public static void main(String[] args) {

        List<Integer> arrayList= Arrays.asList(10,20,50,88,45,98,56,45,78,24,5);
        System.out.println("arrayList = " + arrayList);

        List<Integer> collectedList = arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("collectedList = " + collectedList);
        //one by one print
        arrayList.stream().filter(i->i%2==0).forEach(n->System.out.println(n));//we can replace lambda as method reference


        // i want to add objects into arrayList;
        ArrayList<Integer> al = new ArrayList<>();
        //arrayList.stream().filter()
        //-------------------perform some string

        List<String> names = Arrays.asList("gaurav","sauravkumar","lkahahah","akahs","kr","haja","kamalakja");
        List<String> longnames = new ArrayList<>();
        List<String> ll=names.stream().filter(str->str.length()>3 && str.length()<5).collect(Collectors.toList());
        boolean b = longnames.addAll(ll);
        System.out.println(longnames);
        System.out.println(longnames.get(0));
        System.out.println(names.indexOf("sauravkumar"));
        System.out.println(names.get(2));


    }
}
