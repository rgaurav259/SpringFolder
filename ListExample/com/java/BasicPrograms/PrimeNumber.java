package com.java.BasicPrograms;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=18;
            if (num < 2) {
                System.out.println("Not prime");
                return;
            }
                for (int i = 2; i * i <= num; i++) {
                    if (num % i == 0) {
                        System.out.println("Not prime");
                        return;
                    }
                }
        System.out.println("Prime");
    }
}
