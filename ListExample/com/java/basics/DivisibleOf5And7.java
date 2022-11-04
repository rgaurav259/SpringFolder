package com.java.basics;

import java.util.Scanner;

public class DivisibleOf5And7 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number:-");
//        int n = sc.nextInt();

        int n=1;
        while (true){

            if ((n%5==0)&&(n%7==0)){
                System.out.println("found value is "+n);
                break;
            }
            n++;
        }

    }
}
