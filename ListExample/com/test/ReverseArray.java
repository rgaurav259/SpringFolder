package com.test;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArray(int[] arr){

        int n = arr.length;
        int [] rev = new int[n];
        int j = 0;
        //traverse original array in reverse direction
        for (int i =n-1; i>=0; i--){

            rev[j++] = arr[i];

        }
        return rev;
    }

    //another way to reverse an array
    public static void reveArr(int[] arr){

        int n = arr.length;
        int[] reversed = new int[n];

        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n- 1 - i];
        }
        
        //to print value in array
        for (int revarr : reversed){
            System.out.println(revarr +" ");
        }

    }

    //wothout using new empty  Array we have to change given array then
    public static  void givenArrayChange(int[] arr){
            int i =0;
            int j= arr.length-1;
            while (i < j){
                swapArray(arr, i, j);
                i++;
                j--;
            }
            //for printing 
            for (int x :arr){
                System.out.print(" " + x);
            }

    }

    public static void swapArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    //very short method

    public static void revARR(int[] arr){
            int n = arr.length;
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = temp;
            }
            //for printing
        for (int x : arr){
            System.out.println("x = " + x);
        }
    }
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
        int[] ints = ReverseArray.reverseArray(arr);
        //for printing
        for (int x : ints){
            System.out.print(" " + x);
        }
        System.out.println();

        //ReverseArray.reveArr(arr);

        //ReverseArray.givenArrayChange(arr);

        int[] a = {1,2,9,10};
        ReverseArray.revARR(a);
    }
}
