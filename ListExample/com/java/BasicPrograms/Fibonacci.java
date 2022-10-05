package com.java.BasicPrograms;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number upto which u want:--");
//        int n = sc.nextInt();
        int n =10;
        int a=0,b=1;

        for (int i =0;i<n;i++){
            System.out.println(a);//0 //2nd iterate mai a=1 ho jayega .
            b=a+b; ////b=0+1=1  //2nd iterate b=1+1=2
            a=b-a;//a=1-0=1   //2nd itrate mai a= 2-1=1

        }


    }
}
