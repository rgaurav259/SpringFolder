package com.java.Faq;

public class Swapping {
    public static void main(String[] args) {

        int a =10;
        int b=20;
        System.out.println("without swapping :"+ a+ " "+b);
        //after swapping
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("after  swapping :"+ a+ " "+b);
        int temp =a;
        a=b;
        b=temp;
        System.out.println("after  swapping :"+ a+ " "+b);

    }
}
