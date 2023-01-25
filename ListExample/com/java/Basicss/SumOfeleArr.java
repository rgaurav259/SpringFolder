package com.java.Basicss;

public class SumOfeleArr {
    public static void main(String[] args) {
        int [] arr ={10,20,30,40,50,60};
//        int sum =0;
//        for (int i =0; i< arr.length;i++){
//            sum += arr[i];
//        }
//        System.out.println("sum = " + sum);

        //now using for each loop
        int sum =0;
        for (int x: arr){
            sum+=x;
        }
        System.out.println("sum = " + sum);
    }
}
