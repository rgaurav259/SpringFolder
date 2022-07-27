package com.java.Stream1;

import java.time.Year;
import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur number");
        int n = sc.nextInt();
        Year y = Year.of(n);
        if (y.isLeap()){
            System.out.printf("%d year is leap year " ,n);
        }
        else {
            System.out.printf("%d year is  not leap year " ,n);

        }
    }
}
