package com.java.BasicPrograms;

public class CountNumber {
    public static void main(String[] args) {

        int n=123456789;
        int count=0;
        while (n>0){
            n=n/10;
            count++;
        }
        System.out.println("No of occurrences is:"+count);
    }
}
