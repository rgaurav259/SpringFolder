package com.java.basics;

public class NumercialRectangular {
    public static void main(String[] args) {
        int n=5;
        for (int i =1;i<=n;i++){
            for (int j=i;j<=n;j++){
                System.out.print(j);

            }
            for (int k =1; k<=i-1; k++){
                System.out.print(k);
            }
            System.out.println();
        }


    }
}
