package com.java.FunctionalProgramming;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        int increment = increment(0);

        System.out.println("increment = " + increment);

        int ins = incrementByOneFunction(1);
        System.out.println("ins = " + ins);

        Integer apply = incrementByOneFunction.apply(5);
        System.out.println("apply = " + apply);
    }

   static Function<Integer,Integer> incrementByOneFunction =
            number -> number+1;

    //same as above function
    static int increment (int number){
        return number + 1;
    }

    static int incrementByOneFunction (int number){
        return number + 1;
    }

    //above imperative function
    //now function functional declarative approacch

}
