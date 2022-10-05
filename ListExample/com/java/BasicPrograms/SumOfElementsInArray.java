package com.java.BasicPrograms;

public class SumOfElementsInArray {
    public static void main(String[] args) {

        int arr[]={1,5,7,4,5,2};
        int sum = 0;
//        for (int i =0; i<arr.length;i++){
//            sum= sum+arr[i];
//        }
//        System.out.println(sum);
        
        for (int x : arr){
            sum=sum + x;
        }
        System.out.println("sum  is = " + sum);
    }
}
