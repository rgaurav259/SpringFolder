package com.java.lambdaExprssion;

import java.util.function.Predicate;

public class PredicateExample {

    //it contains only one abstract method
    public static void main(String[] args) {

        Predicate<Integer> p = i->i%2==0;
        System.out.println(p.test(25));
        System.out.println(p.test(50));
        System.out.println(p.test(55));
        System.out.println(p.test(874));



    }
}
