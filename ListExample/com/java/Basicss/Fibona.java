package com.java.Basicss;

import java.util.Scanner;

public class Fibona {
    public static void main(String[] args) {

        System.out.println("enter number upto which u want: " );
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a=0,b=1;
        for (int i =0;i<n;i++){
            System.out.print(a + " ");
            a=a+b;
            b=a-b;
        }

    }
}
