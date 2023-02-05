package com.test.Basic;

public class FibonacciSe {
    public static void main(String[] args) {
        int a =0,b=1;
        int n = 5;
        for (int i = 0; i <= n; i++){
            System.out.print(a+" ");
            a=a+b;
            b=a-b;
        }


    }
}
