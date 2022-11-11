package com.java.Practice;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        int[] arr ={10,20,30,40};
        int sum = 0;
        for (int i =0;i< arr.length;i++){
            sum = sum + arr[i];
        }
       System.out.println("sum = " + sum);

        //using for-each loop
        int summ =0;
        for (int x :arr){
            summ= summ+x;
        }
        System.out.println("sum is  = " + summ);
    }    
}
