package com.java.Basicss;

public class swapnumb {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("without swapping :a is : " + a +" and b is : "+ b);
        //now swapping
//without using third variable
//        a = a+b;
//        b = a-b;
//        a = a-b;
//        System.out.println("After  swapping :a is : " + a +" and b is : "+ b);

        //now using third variable
        int temp =a;
        a=b;
        b=temp;
        System.out.println("After  swapping :a is : " + a +" and b is : "+ b);


    }
}
