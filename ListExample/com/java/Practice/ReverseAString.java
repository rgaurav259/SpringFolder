package com.java.Practice;

import java.util.Iterator;
import java.util.Objects;

public class ReverseAString {
    public static void main(String[] args) {

//        String s = new String("gaurav");
//        String s1 = "gaurav";
//        String s2 = "gaurav";
//        String s3 = "gaurav";
//        String s4 = "gaurav";
//        System.out.println(s1==s2);
//        System.out.println(s==s2);//because s created 2 objects one is scp area and 2nd is heap
//
        String str = "madam";
        String org_str = str;
        int n = str.length();
        String rev = "";
            for (int i =(n-1);i>=0;i--){
                char c = str.charAt(i);
                rev = rev+c;

            }
        System.out.println(rev);
        //also check palidnrome string

        if (org_str.equals(rev)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }


        String  ssss = "gauravkumar";
            StringBuffer sb = new StringBuffer(ssss);
        System.out.println(sb.reverse());
        //using sringBuildr




        String strrr = "gaurav";
        StringBuilder s = new StringBuilder(strrr);
        StringBuilder reverse = s.reverse();
        System.out.println("reverse = " + reverse);




    }
}
