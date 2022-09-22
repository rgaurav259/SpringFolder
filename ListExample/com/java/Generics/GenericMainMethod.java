package com.java.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMainMethod {
    public static void main(String[] args) {

        print(1);
        print("gaurav");
        print(3.0);


        prints(1,8);
        prints("gaurav","kumar");
        prints(3.0,56);


        printing(1,5);

        List<Integer> inlist = new ArrayList<>();
        inlist.add(1);
        printiting(inlist);


        printtttt(Arrays.asList(1,2));
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        printtttt(al);


    }

    //method t type
    private static <T> void print(T t){
        System.out.println(t);
    }

    //method t v type
    private static <T,U> void prints(T t,U u){
        System.out.println(t);
        System.out.println(u);

    }

    //we can return as well T type

    private static <T,U>  T printing(T t,U u){
        System.out.println(t);
        System.out.println(u);
        return t;
    }


    //TODO; wild card genrics how to use ..

    private static void printiting(List<?> list){
        System.out.println(list);
    }

//
    private static void printtttt(List<? extends Number> list){
        System.out.println(list);
    }

}
