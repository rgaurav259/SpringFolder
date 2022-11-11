package com.java.Practice;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {

        System.out.println("how much size do u want:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("enter element");
        for (int i =0; i<size; i++){

            arr[i]= sc.nextInt();
        }
        //print value
        
        for (int x : arr){
            System.out.print(" " + x);
        }
    }
}
