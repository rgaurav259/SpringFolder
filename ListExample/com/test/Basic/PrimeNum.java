package com.test.Basic;

public class PrimeNum {
    public static void main(String[] args){

//        int n=17;
//        int count=0;
//        if(n <= 1){
//            System.out.println("not prime");
//            return;
//        }
//        for (int i =1; i <= n/2;i++){
//            if(n%i==0){
//                count++;
//            }
//        }
//        if(count > 1){
//            System.out.println(" not prime number");
//        }else {
//            System.out.println("Prime ");
//        }

        //factorial
        int nums = 5;
        int fact=1;
        for (int i =1; i <= nums; i++){
          fact= fact * i;
        }
        System.out.println("fact = " + fact);
    }
}
