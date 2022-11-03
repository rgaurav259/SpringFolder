package com.java.basics;

public class StringReverse {
    public static void main(String[] args) {

        String str = "gaurav";

        char[] ch = str.toCharArray();
        for (int i = ch.length-1; i>=0; i--){
            System.out.print(ch[i]);
        }
        System.out.println();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

        System.out.println();
        StringBuffer sf = new StringBuffer(str);
        System.out.println(sf.reverse());


        //aproach 4
        for (int i = str.length()-1; i>=0;i--){
            System.out.println(str.charAt(i));
        }

    }
}
