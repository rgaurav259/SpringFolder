package com.java.Sort;

public class BubbleSorting {

    public static void main(String[] args) {
        int[] arr ={10,20,50,70,80,90,5,11};
        for (int i=0; i<arr.length-1; i++){
        for (int j=0;j< arr.length-1-i;j++){
            if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
            }
        }
        }

        for (int a:arr) {
            System.out.print(a + " ");
        }

        }

    }


