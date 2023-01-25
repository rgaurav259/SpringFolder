package com.java.Basicss;

public class StriingReverse {
    public static void main(String[] args) {
        String str = "madamhhh";
        String  orgString= str;
        String rev="";
        int len = str.length();
        for (int i = len - 1; i >=0; i--) {
            rev = rev+str.charAt(i);
        }
        System.out.println("rev = " + rev);

        //now using stringBuilder
//        StringBuilder sb = new StringBuilder(str);
//        StringBuilder reverse = sb.reverse();
//        System.out.println("reverse = " + reverse);

        //now StringBuffeer
//        StringBuffer sb = new StringBuffer(str);
//        StringBuffer reverse = sb.reverse();
//        System.out.println("reverse = " + reverse);

        //now check palindrome
        if (orgString.equals(rev)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
