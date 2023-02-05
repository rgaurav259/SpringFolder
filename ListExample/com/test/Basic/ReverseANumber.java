package com.test.Basic;

import com.test.ReverseArray;

import java.util.Scanner;

public class ReverseANumber {
    public int rev(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int rev =0;
        while ( n!= 0){
            rev =  rev * 10 +n % 10;
            n= n/10;
        }
        System.out.println("rev = " + rev);

        if (originalNumber==rev){
            System.out.println("palindrom");
        }else{
            System.out.println("not palindrome");
        }
        return rev;

    }

    public static void main(String[] args) {

        ReverseANumber reverseANumber = new ReverseANumber();
        int rev = reverseANumber.rev();
        System.out.println("rev = " + rev);
    }
}
