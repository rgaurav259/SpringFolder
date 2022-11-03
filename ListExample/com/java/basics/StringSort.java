package com.java.basics;

import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        String str = "java";

        char[] arr = str.toCharArray();
        char temp;
        for (int i =0;i<arr.length;i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]>arr[j]){
                    temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (char s :arr){
            System.out.print(" "+ s);
        }
        System.out.println();
        System.out.println(new String(arr));


        //using sort method

        String str1 = "javasddsdsdsdsccedeexxaaaa";

        char[] arrrrrr = str1.toCharArray();
        Arrays.sort(arrrrrr);
        for (char c : arrrrrr){
            System.out.println(" " + c);
        }
    }
}
