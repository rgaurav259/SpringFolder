package com.java.lambdaExprssion;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {

        //
        Function<Integer,Integer> f1 =i->i*2;
        Function<Integer,Integer> f2 =i->i*i*i;

        System.out.println(f1.andThen(f2).apply(2));//first f1 -2*2=4; then f2 =4*4*4=64;   answer :64
        System.out.println(f1.andThen(f2).apply(4));//same above process
        System.out.println("----------------------------------");

        System.out.println(f1.compose(f2).apply(4)); //first f2 and then f1.=64*2=128
        System.out.println(f1.compose(f2).apply(8));//512*2=1024


    }
}
