package com.java.Practice;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number:");
//        int n= sc.nextInt();
//        int rev =0;
//        while (n!=0){
//            rev = rev*10+n%10;
//            n= n/10;
//        }
//        System.out.println("reverse is "+rev);
        int n =12345;
        StringBuffer sb = new StringBuffer(String.valueOf(n));
        StringBuffer reverse = sb.reverse();
        System.out.println(reverse);
        
        StringBuilder sbs = new StringBuilder(String.valueOf(n));
        System.out.println(sbs.reverse());
        
        StringBuilder ssss = new StringBuilder();
        StringBuilder append = ssss.append(n);
        System.out.println(append.reverse());



    }
}
