package com.java.Sorting;

public class Selection {
    public static void main(String[] args) {

        int[] arr = {8, 7, 2};

        int i, j, min;
        for (i = 0; i < arr.length - 1; i++) {
            min = i;
            for (j=i+1;j< arr.length;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
        //print elements after sorting
        for (int x : arr){
            System.out.print(x+" ");
        }

    }
}
