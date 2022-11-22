package com.java.BasicPrograms;

public class WholeStringReverse {
    public static void main(String[] args) {
        String str = "welcome to java";
        String[] words = str.split("\\s");

        String reverseWord = "";

        for (String w: words){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();

            reverseWord = reverseWord + sb.toString()+" ";
        }
        System.out.print("reverseWord = " + reverseWord);

    }
}
