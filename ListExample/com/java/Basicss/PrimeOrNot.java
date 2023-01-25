package com.java.Basicss;

public class PrimeOrNot {
    public static void main(String[] args) {
        int num =17;
        int count=0;
        for( int i=(num/2); i > 0; i--){
            if(num % i == 0 ) {
                count++;
                if( count >= 2) {
                    System.out.println("Not a Prime Number");
                    break;
                }
            }

        }  if(count<=1) {
            System.out.print("Prime Number");
        }
    }
}
