package com.test.Basic;

public class SumOfDigits {
    public static void main(String[] args) {
        int num =1234;
        int sum =0;
        while (num!=0){
            sum = sum + num %10;
            num=num/10;
        }
        System.out.println("sum = " + sum);


        //find largest number of three
        int a =80,b=0,c=30;
        if(a > b && a > c){
            System.out.println("a is greater= " + a);
        } else if (b>a && b>c) {
            System.out.println("b is greater= " + b);

        }else {
            System.out.println("c  is largest= " + c);
        }
    }

}
