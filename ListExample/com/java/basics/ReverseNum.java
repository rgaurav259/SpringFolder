package com.java.basics;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
//        System.out.println("enter number ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int rev=0;
//        while(n!=0){
//            rev =rev*10 + n%10;
//            n= n/10;
//
//        }
//        System.out.println("revers is :"+rev);
        
        //uisng string buffer
        int  n = 123456;
        StringBuffer sb = new StringBuffer(String.valueOf(n));
        System.out.println(sb.reverse());
        
        //string builder
        StringBuilder sbs = new StringBuilder();
        sbs.append(n);
        System.out.println("reverse = " + sbs.reverse());

    }
}
