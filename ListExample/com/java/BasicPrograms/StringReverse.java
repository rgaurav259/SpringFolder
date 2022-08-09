package com.java.BasicPrograms;

public class StringReverse {
    public static void main(String[] args) {
        String str ="ABCD";
        String rev ="";
//        int len = str.length();
//        for (int i = len-1; i >= 0; i--){
//            rev = rev + str.charAt(i);
//        }

        //using to char array

//        char[] a =str.toCharArray();
//        int lengthsss = a.length;
//        for (int i= lengthsss-1;i >= 0;i--){
//            rev=rev+a[i];
//        }

        //using stringbuffer

        StringBuffer sb = new StringBuffer(str);
        StringBuffer reverse = sb.reverse();
        System.out.println("Reverse is = " + reverse);
    }
}
