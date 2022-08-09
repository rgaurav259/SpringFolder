package com.java.BasicPrograms;

public class StringPalindrome {
    public static void main(String[] args) {

        String str = "MADAM";
        String rev="";
        String orgStr=str;
        int n= str.length();
        for (int i=n-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if (orgStr.equals(rev)) {
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is NOT palindrome");

        }
        //System.out.println(rev);
    }
}
