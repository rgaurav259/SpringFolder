package com.test.Basic;

public class Swap {
    public static void main(String[] args) {
        int a =40,b=20;
        System.out.println("value of a is " + a + " and b is " + b);
//        int temp = a;
//        a=b;
//        b=temp;
//        System.out.println("value of a is " + a + " and b is " + b);
        //without using 3rd varable
        a = a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of a is " + a + " and b is " + b);
    }

}
