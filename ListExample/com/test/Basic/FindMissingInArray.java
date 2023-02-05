package com.test.Basic;

import java.util.Arrays;

public class FindMissingInArray {

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    //print index
    public static int findMissingIndex(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i;
            }
        }
        return arr.length;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9};
        int missingNumber = FindMissingInArray.findMissingNumber(arr);
        System.out.println("missingNumber = " + missingNumber);
        int missingIndex = FindMissingInArray.findMissingIndex(arr);
        System.out.println("missingIndex = " + missingIndex);
    }
}
