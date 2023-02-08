package com.test.newBasic;

import com.test.Basic.PrimeFact;

public class PrimeNumber {

    public static void primeNum(){
        int n=2;
        int count=0;
        if(n < 2){
            System.out.println("not a prime number");
            return;
        }
        for (int i =1; i <=n/2; i++){
            if(n % i == 0){
                count++;
            }
        }
        if (count >1){
            System.out.println("not a prime number");
        }
        else {
            System.out.println("Prime number");
        }
    }

    public static void PrimeFact(){
        int n=100;
        for (int i =2; i <= n; i++){
            while (n %i == 0){
                System.out.print(" " +i);
                n = n/i;
            }
        }
    }

    public static void main(String[] args) {
        PrimeNumber.primeNum();
        PrimeFact();
    }
}
