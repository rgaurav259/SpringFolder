package com.java.Practice;

public class CountNumberOFDigits {
    public static void main(String[] args) {

        int n =123456789;
        int count =0;
        
        while (n!=0){
            n = n/10;
            count++;
        }
        System.out.println("count = " + count);
        //also check even count odd count
    }
}
