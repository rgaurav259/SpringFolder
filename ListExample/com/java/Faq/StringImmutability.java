package com.java.Faq;

public class StringImmutability {
    public static void main(String[] args) {
        String s = new String("gaurav");
        String ch = s.concat("kumar");
        System.out.println("s = " + s);
        System.out.println("ch = " + ch);

        s = "kumar";
        System.out.println("s = " + s);

    }
}
