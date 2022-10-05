package com.java.BasicPrograms;

import java.util.Scanner;

public class SumOfArrayUsingInput {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Length of the Array : ");
        int len = sc.nextInt();
        int[] intArray = new int[len];
        for(int i = 0; i< len; i++){
            System.out.print("Enter the Element Array["+i+"] : ");
            intArray[i]= sc.nextInt();
        }

        int sum = 0;

        for (int j : intArray) {
            sum = sum + j;
        }

        System.out.println("Sum of the Array Elements is : " + sum);
    }
}
