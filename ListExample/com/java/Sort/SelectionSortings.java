package com.java.Sort;

public class SelectionSortings {

    public static void printArray(int[] arr){
        for (int x :arr){
            System.out.print(" "+x);
        }

    }
    public static void main(String[] args) {

        int arr[]={10,20,50,42,1,5,2,4,96,25};
        for (int i =0;i< arr.length-1;i++){
            int min = i;
            for (int j =i+1;j< arr.length;j++){
                if (arr[min] > arr[j]){
                    min= j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

        //
        printArray(arr);


    }
}
