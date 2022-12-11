package com.java.Faq;

import java.util.Scanner;

public class ArrayEVenAndOdd {
    public static void main(String[] args) {
        System.out.println("enter number which upto u want..");
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int n = sc.nextInt();
        System.out.println("enter Elements..");
        int[] arr = new int[n];

        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array elements are ");
        for (int value : arr){
            System.out.print(value+ " ");
        }
        System.out.println();
        //find even and odds  print from arrrays
        for (int i =0; i<n;i++){
            if (arr[i] % 2 == 0){
                System.out.print("even number is : " + arr[i]);
            }
            else {

                System.out.print(" odd numbers are " + arr[i]);
            }
        }
    }
}
