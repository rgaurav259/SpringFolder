package com.test.Basic;

public class PrimeFact {
    public static void primeFactorNum(){
        int num = 36;
        for (int i =2; i<=num;i++){
            while (num % i == 0){
                System.out.print(" " + i);
                num = num/i;
            }
        }
    }

    public static void PrimeNum(){

        int num=15;
        int count =0;
        if(num < 2){
            System.out.println("not Prime number");
        }
        for (int i =1;i<=num/2;i++){
            if (num% i ==0){
                count++;
            }
        }
        if (count > 1) {

            System.out.println("not prime");
        }
        else {
            System.out.println("prime");
        }
    }
    public static void main(String[] args) {
        PrimeFact pf = new PrimeFact();
        primeFactorNum();
        PrimeNum();

    }

}
