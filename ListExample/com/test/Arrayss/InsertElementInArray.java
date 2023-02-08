package com.test.Arrayss;

import java.util.Scanner;

public class InsertElementInArray {


    public static void main(String[] args) {


        System.out.print("enter number which upto u want ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array");
        for (int i =0; i< arr.length;i++){
            arr[i]= sc.nextInt();
        }

//        for (int i =0; i< arr.length;i++){
//            arr[i]=i;
//        }

        
        for (int j = 0; j< arr.length; j++){
            System.out.print(" " + arr[j]);
        }
    }
}
