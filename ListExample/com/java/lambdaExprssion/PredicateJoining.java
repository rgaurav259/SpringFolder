package com.java.lambdaExprssion;

import java.util.function.Predicate;

public class PredicateJoining {
    public static void main(String[] args) {
        //join 2 predicate
        int [] x = {0,3,2,1,5,10,15,20,25,30,35,40,45,50};
//condition is even number and which is greter than 10
        Predicate<Integer> p1 =i->i%2==0;//boolean return
        Predicate<Integer> p2 =i->i>=10;

        for (int x1 :x){
            //if (p1.and(p2).test(x1)) {//             if (p1.and(p2).test(x1)){ //
                 if (p1.or(p2).test(x1)){
                System.out.println(x1);
            }
            System.out.println("-------------------");

        }
        //not even number
        for (int x1:x){
            if (p1.negate().test(x1)){
                System.out.println(x1);
            }
        }
    }
}
