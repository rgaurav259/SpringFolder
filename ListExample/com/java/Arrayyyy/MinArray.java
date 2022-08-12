package com.java.Arrayyyy;

public class MinArray {

    public int findMinArray(int[] arr){
        //edge case
        if (arr==null || arr.length==0){
            throw new IllegalArgumentException("invalid exception........!!!!!!!!!!!!!!!!");
        }
        int len = arr.length;
        int min=arr[0];
        for (int i=1;i<len;i++){
            if (arr[i] < min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        MinArray minArray = new MinArray();
       // int arr[]={10, 20, 40, 30, 2, 5, 1}; we can aslo specify like this
        int mimimumArray = minArray.findMinArray(new int[]{10, 20, 40, 30, 2, 5, 1});
        System.out.println("mimimumArray = " + mimimumArray);

    }
}
