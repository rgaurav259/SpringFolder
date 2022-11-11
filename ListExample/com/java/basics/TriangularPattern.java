package com.java.basics;

public class TriangularPattern {
    public static void main(String[] args) {
        int n=5;
//        triangle
//        for (int i =1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //revers Triangle
        for (int i =1;i<=n;i++){
            for (int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
