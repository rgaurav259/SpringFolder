package com.java.Practice;

public class ArrayLarge {



    public static void main(String[] args) {
        int [] arr ={10,20,60,400,5,45,854,25,1};
        int big =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i =0; i<arr.length; i++){
            if (big < arr[i]){
                big = arr[i];
            }
            //min value
            if (min > arr[i]){
                min= arr[i];
            }
        }
        System.out.println("big = " + big);
        System.out.println("min = " + min);
    }
}
