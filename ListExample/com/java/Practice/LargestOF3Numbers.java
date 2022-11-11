package com.java.Practice;

public class LargestOF3Numbers {
    public static void main(String[] args) {

        int a=110,b=2,c=10;
        if (a>b && a>c){
            System.out.println("A is Greater  : " +a);
        } else if (b>a && b>c) {
            System.out.println("B is greater");
        }
        else {
            System.out.println("C is greater");
        }

        //using turnary

       int  max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("mAXIMUM IS " + max);
    }
}
