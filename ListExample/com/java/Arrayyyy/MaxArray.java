package com.java.Arrayyyy;

public class MaxArray {

    public int findMaxArray(int[] arr){
        int len = arr.length;
        int max=arr[0];
        for (int i =1;i<len;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        MaxArray mx = new MaxArray();
        int maxArray = mx.findMaxArray(new int[]{12, 25, 30, 1, 40});
        System.out.println("maxArray = " + maxArray);

    }
}
