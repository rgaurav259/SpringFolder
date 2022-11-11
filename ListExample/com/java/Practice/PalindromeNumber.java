package com.java.Practice;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n =121;
        int org_num =n;
        int rev = 0;
            while (n!=0){
                rev = rev*10 + n%10;
                n=n/10;
            }
            if (org_num == rev){
                System.out.println("palindrome");
            }
            else {
                System.out.println("not palindrome");
            }



    }
}
