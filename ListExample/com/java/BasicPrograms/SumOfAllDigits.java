package com.java.BasicPrograms;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int n = 12345;
        int sum =0;
//        while (n>0){
//            sum = sum+n%10; //5+4+3+2+1
//            n =n/10;
//        }
//        System.out.println("sum = " + sum);

        //other way
        for (int i =0;i<=5;i++){
            sum = sum+i;
        }
        System.out.println("sum = " + sum);
    }
}
