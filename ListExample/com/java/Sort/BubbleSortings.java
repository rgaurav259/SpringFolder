package com.java.Sort;

public class BubbleSortings {

    public static void printArry(int[] arr){
        for (int printValue : arr){
            System.out.print(" "+printValue);
        }

    }

    public static void main(String[] args) {

        int[] arr = {5,95,43,54,6,7,23};
        for (int i=0; i<arr.length-1;i++){
            for (int j = 0;j< arr.length-i-1;j++){
                if (arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //call method
        printArry(arr);
    }
}
