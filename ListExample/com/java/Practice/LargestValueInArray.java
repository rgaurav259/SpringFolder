package com.java.Practice;

public class LargestValueInArray {

    public static int largestValueInArray(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i =0; i<arr.length;i++){
            if (largest < arr[i]){
                largest= arr[i];
            }
        }
        return largest;
    }
    public static int minimuValueInArray(int arr[]){
        int minimum = Integer.MAX_VALUE;
        for (int i =0; i<arr.length;i++){
            if (minimum > arr[i]){
                minimum= arr[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {

        int arr[]={10,20,40,80,1,4546};

        int largestValueInArray = largestValueInArray(arr);
        int minimuValueInArray = minimuValueInArray(arr);

        System.out.println("minimuValueInArray = " + minimuValueInArray);
        System.out.println("largestValueInArray = " + largestValueInArray);
    }
}
