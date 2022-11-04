package com.java.basics;

public class Swapping2Numbers {
    public static void main(String[] args) {
        int a =10,b=20;
        //swap
        System.out.println("without swapping is a is : " + a + "and B is: " + b);

//        int t=a;
//        a=b;
//        b=t;
//        System.out.println("After swapping is a is : " + a + " and B is: " + b);
        //without usign 3rd variable;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping is a is : " + a + " and B is: " + b);



    }
}
