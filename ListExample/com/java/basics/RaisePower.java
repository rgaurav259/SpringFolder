package com.java.basics;

import java.util.Scanner;

public class RaisePower {
    public static void main(String[] args) {

//        int a=2, b=5;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans=1;
        for (int i=1;i<=b;i++){
            ans = ans * a;
        }
        System.out.println(ans);
    }
}
