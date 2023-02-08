package com.test.newBasic;

public class Bubble {
    public  static void BubbleSort(int[] arr){
        int len = arr.length;
        for (int i =0; i<len-1;i++){
            for (int j =0;j<len-1-i;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int a : arr){
            System.out.print(" "+a);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,20,40,5,14,12};
        Bubble.BubbleSort(arr);

    }
}
