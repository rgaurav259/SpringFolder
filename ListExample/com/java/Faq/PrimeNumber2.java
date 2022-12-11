package com.java.Faq;

public class PrimeNumber2 {
    public static void main(String[] args) {
        int n =17;
        boolean flag =false;
        for (int i = 2; i <= n/2; i++){
            if (n % i == 0){
                flag=true;
                break;
            }
        }
        if (!flag){
            System.out.println("number is prime " + n);
        }
        else {
            System.out.println("number is Not Prime " + n);
        }
    }
}
