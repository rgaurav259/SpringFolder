package com.java.basics;

public class SumOfDigits {
    public static void main(String[] args) {

        int num =12345;
        int sum =0;
        while (num >0){
            sum = sum +num%10;
//            sum+=num%10; //we can write like this also
            num = num/10;
        }
        System.out.println(sum);

        int summ=0;
        String st = "123456789123456789123422";
        for (int i = 0; i < st.length(); i++) {

            // Since ascii value of
            // numbers starts from 48
            // so we subtract it from sum
            summ = summ + st.charAt(i) - 48;
        }
        System.out.println("summ = " + summ);

    }
}
