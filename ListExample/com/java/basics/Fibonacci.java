package com.java.basics;



public class Fibonacci {

    public static void main(String[] args) {

        int n =10;
        int c, a =0,b=1;
        for (int i =1;i<=n;i++){
            c=a+b;
            System.out.print(" " + a);
            a=b;
            b=c;
        }
    }
}
