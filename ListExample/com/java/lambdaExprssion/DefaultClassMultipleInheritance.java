package com.java.lambdaExprssion;

interface  Left{
   default void m1(){
       System.out.println("left interface m1 method");
    }
}
interface Right{
    default void m1(){
        System.out.println("Right interface m1 method");
    }
}

public class DefaultClassMultipleInheritance implements Left,Right{

    @Override
    public void m1() {
        System.out.println("our own  interface m1 method");


        Left.super.m1();
        //we can call using super whatever interface method we want
        Right.super.m1();
    }
    public static void main(String[] args) {
        DefaultClassMultipleInheritance d = new DefaultClassMultipleInheritance();
        d.m1();

    }
}
