package com.java.lambdaExprssion;

import java.util.function.Function;

public class FunctionInterfaceExample {

    public static void main(String[] args) {

        Function<Integer,Integer> f =i->i*i;
        System.out.println(f.apply(4));
        System.out.println(f.apply(5));
        System.out.println("----------------------------------");

        //now find lenth
        //input string and returnn integer
        Function<String,Integer> stringIntegerFunction= i->i.length();
        System.out.println(stringIntegerFunction.apply("gaurav"));
        System.out.println(stringIntegerFunction.apply("saurabhkumar"));

        System.out.println("----------------------------------");

        Function<String ,String > fs = s -> s.toUpperCase();
        System.out.println(fs.apply("garuraa a admv aevamnsnsmma aevamv amcad ea "));



    }
}
