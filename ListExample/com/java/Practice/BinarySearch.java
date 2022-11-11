package com.java.Practice;

public class BinarySearch {

    public static void main(String[] args) {
        //must be array sorted
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int data = 100;
        int l =0;
        int h = arr.length-1;
        while (l <= h){
            int mid = (l+h)/2;
            if (data > arr[mid]){
                   l = mid+1;
            } else if (data < arr[mid]) {
                h = mid-1;
            }
            else {
                System.out.println(mid);
                return;
            }
        }
        System.out.println(-1);


    }
}
