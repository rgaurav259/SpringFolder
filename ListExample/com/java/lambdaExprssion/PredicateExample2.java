package com.java.lambdaExprssion;

import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {

        String[] s ={"gaurav","nag","saurabhkumar","valaiah","ram"};

        Predicate<String> p = s1-> s1.length()%2==0;
        for (String s1 :s){
            if (p.test(s1)){
                System.out.println(s1);
            }
        }

    }
}
