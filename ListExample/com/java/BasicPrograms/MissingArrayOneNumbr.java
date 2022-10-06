package com.java.BasicPrograms;

public class MissingArrayOneNumbr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int sum =0;
        for (int i =0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println("sum of natural numbers: " +sum);
        int missing =0;
        for (int i =1;i<=5;i++){
            missing= missing+i;
        }
        System.out.println("missing number sum "+missing);
        System.out.println("missing number is " +(missing - sum));

    }
}
