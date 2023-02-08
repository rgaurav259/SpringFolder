package com.test.String;

public class RemoveDupChars {
    public static void main(String[] args) {

        String str = "Programming";

        //Approach-1

        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(x->  sb.append((char)x));
        System.out.println("sb = " + sb);
    }
}
