package com.java.Faq;

public class BinarySearchArrauUsingMEthod {
    
    public int binarySearch(int[] arr, int key) {
        int hi = arr.length - 1;
        int low = 0;
        while (low <= hi) {
            int mid = (low + hi) / 2;
            if (key > arr[mid]) {
                low = mid + 1;
            } else if (key < arr[mid]) {
                hi = mid - 1;
            } else {
                //System.out.println("value found at index  = " + mid);
                return mid;
            }
        }
        return hi;
    }



    public static void main(String[] args) {
        int[]arr1={10,20,30,40,50,60,70,80,90};
        int data=200;
        BinarySearchArrauUsingMEthod bl = new BinarySearchArrauUsingMEthod();
        int foundIndex = bl.binarySearch(arr1, data);
        System.out.println("foundIndex at = " + foundIndex);


    }
}
