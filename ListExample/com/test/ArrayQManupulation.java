package com.test;

import java.util.HashSet;
import java.util.Set;

public class ArrayQManupulation {
//Q1. find the unique number in a given array where all the elements
    // are being repeated twice with one value being unique

    public int uniqueElements(int[] arr){
        for (int i =0; i < arr.length; i++){
                for (int j =i+1; j<arr.length; j++){
                    if(arr[i]==arr[j]){
                        arr[i]=-1;
                        arr[j]=-1;
                    }
                }
        }
        int ans =-1;
        for (int i =0; i< arr.length;i++){
            if(arr[i] > 0){
                ans =arr[i];
            }
        }
        return ans;
    }
    //Q 2. find the second largest elements of the array;
    public int secondLargestValue(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    //Q3. given an array  return the first value that is repeating this array.
    //if no value is being repeated return -1;
    public int repearingFirstArray(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,2,1,3}; //ouput : 4 unique elements
        ArrayQManupulation am = new ArrayQManupulation();
        int uniqueElements = am.uniqueElements(arr);
        System.out.println("uniqueElements = " + uniqueElements);

        int[] arrs = {3,1,4,1,4,4,3};
        int secondLargestValue = am.secondLargestValue(arrs);
        System.out.println("The second largest element of the array is: " + secondLargestValue);



        int[] a = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int repearingFirstArray = am.repearingFirstArray(a);
        System.out.println("repearingFirstArray = " + repearingFirstArray);
    }
}
