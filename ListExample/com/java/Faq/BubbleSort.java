package com.java.Faq;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={10,20,40,50,80,45};

        for (int i =0;i< arr.length-1;i++){
            for (int j =i;j< arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){

                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }for (int x:arr){
            System.out.print(x+ " ");
        }

    }
}
