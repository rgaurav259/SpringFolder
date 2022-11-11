package com.java.Practice;

public class FibonacciSeries {
    public static void main(String[] args) {

        int n=10;
        int a=0,b=1;
        for (int i =1;i<=n;i++){
            System.out.println(a);
            a=a+b;
            b=a-b;
        }
    }
}
