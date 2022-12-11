package com.java.Faq;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=7;
        int a=0;
        int b=1;
        for (int i=1;i<=n;i++){
            System.out.println(a);
            a=a+b;
            b=a-b;
        }

    }
}
