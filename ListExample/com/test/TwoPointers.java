package com.test;

public class TwoPointers {
    public static void main(String[] args) {
        int[] arr ={1,1,0,0,1,0,1,0,0,1,0,1};
        //sort without any inbuilt methods
        int n = arr.length;

        for(int i =0; i<n; i++){
            for (int j =i+1; j<n-1; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int x :arr){
            System.out.println("x = " + x);

        }
        System.out.println(arr.length);
    }
}
