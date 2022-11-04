package com.java.basics;

import java.util.Scanner;

public class SeriesAnswer {
    public static void main(String[] args) {

        //series 1-2+3-4+5-6+7-8+9-10
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number -");
        int n = sc.nextInt();
        int ans =0;
        for (int i =1; i<=n; i++){
            if (i%2==0){
                ans = ans-i;
            }else
                ans = ans+i;
        }
        System.out.println("ans = " + ans);
    }
}
