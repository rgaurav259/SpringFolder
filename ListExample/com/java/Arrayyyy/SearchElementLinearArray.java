package com.java.Arrayyyy;

import java.util.Scanner;

public class SearchElementLinearArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter elemnts which u want: -");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0;i<n;i++){
            System.out.println("enter the element:-");
             arr[i]= sc.nextInt();
        }
        System.out.println("enter the eement yow want to find ");
        int x = sc.nextInt();

    }
}
