package com.java.Faq;

public class CountNumberOfDigits {

    public static void main(String[] args) {
//        int n =12345;
//        int count =0;
//        while (n!=0){
//            n= n/10;
//            count++;
//        }
//        System.out.println("count = " + count);

        //now count even and odd both
        int num = 1487954687;
        int rem =0;
        int even_count =0;
        int odd_count =0;
        while (num!=0){
            rem =num%10;
            if (rem %2 == 0){
                even_count++;
            }else {
                odd_count++;
            }
            num=num/10;
        }
        System.out.println("odd_count = " + odd_count);
        System.out.println("even_count = " + even_count);

    }
}
