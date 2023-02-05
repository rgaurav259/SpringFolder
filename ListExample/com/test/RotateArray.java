package com.test;

public class RotateArray {


    public static int[] rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }
        return rotated;
    }

    public static void main(String[] args) {


        int[] arr ={1,2,3,4,5};
        int k =2;
        int[] rotateArray = RotateArray.rotateArray(arr, k);
        //print rotate result array
        for (int x: rotateArray){
            System.out.print(" " + x); //2 3 4 5 1
        }

    }
}
