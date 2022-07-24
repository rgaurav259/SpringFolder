package com.java.Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//class MyComparataor implements Comparator<Integer>{
//
//    @Override
//    public int compare(Integer obj1, Integer obj2) {
//        //using turnory also
//        return (obj1<obj2) ? -1 :(obj1>obj2)? +1 :0;
//
//        //-------------
////        if (obj1 < obj2){
////            return -1;
////        }
////        else if (obj1 >obj2){
////            return +1;
////        }
////        else {
////            return 0;
////        }
//    }
//}
//         if comparator is functional interface then we have to used lambda expression

///-------------------------------------

public class LambdaExpressionUsingCollection {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(56);
        al.add(80);
        al.add(4);
        al.add(5);
        al.add(27);
        System.out.println("al = " + al);
        //Collections.sort(al,new MyComparataor());//by default it is printing descending order
        //but we have to add logic mycomparator class to print ascending order
        //System.out.println("After Sorting"+al);

        //now uisng lambda

        Comparator<Integer> r = (obj1,obj2)->{return (obj1 < obj2) ? -1 :(obj1>obj2)? +1 :0;};
        //even we can remove curly braces and return statement also .
        Collections.sort(al,r);

        System.out.println("After sorting -------lambda " + al);

        //now using stream
        al.stream().forEach(System.out::println);//one by one cursor concepts

        //now even number find and print
        List<Integer> list = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(list);

    }
}
