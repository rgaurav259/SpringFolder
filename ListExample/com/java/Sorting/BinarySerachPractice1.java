package com.java.Sorting;

public class BinarySerachPractice1 {
    public static void main(String[] args) {

        int[] arr ={10,20,30,40,50,60,70};
        int low=0;
        int hi = arr.length-1;
        int data = 10;
        while (low <=hi){
            int mid = (low+hi)/2;
            if (data > arr[mid]){
                    low = mid+1;
            } else if (data <arr[mid]) {
                    hi =mid-1;
            }else {
                System.out.println("found at index " + mid);
                break;
            }


        }
    }
}
