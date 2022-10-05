package com.java.BasicPrograms;

public class Factorial {
    public static void main(String[] args) {
        int n=6;
        int fact =1;
        for (int i =1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Ascending order factorail is : " + fact);

        //reverse order
//        for (int i =n;i>=1;i--){
//            fact=fact*i;
//        }
//        System.out.println("Descending  order factorail is : " + fact);

    }
}
