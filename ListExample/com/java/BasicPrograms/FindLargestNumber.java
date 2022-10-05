package com.java.BasicPrograms;

public class FindLargestNumber {
    public static void main(String[] args) {
        int a=10,b=20,c=120;
        if (a > b && a >c){
            System.out.println("a is greater= " + a);
        } else if (b > a && b > c) {
            System.out.println("b is greater = " + b);
        }
        else {
            System.out.println("c is greater :"+c);
        }

        //another way
        int largests=c > (a>b?a:b)? c:(a>b?a:b);

      int largest= Math.max(c, Math.max(a, b));
        System.out.println("largest = " + largest);
        System.out.println("largests = " + largests);
    }
}
