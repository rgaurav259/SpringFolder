package com.java.Faq;

public class ReverseEachWordAndParagraph {
    public static void main(String[] args) {

        String str = "java code are very important";//output avaj edoc
        //we have to first convert String[] array to using split method
        String output = "";
        String[] words = str.split(" ");
        for (String word : words){
//iterate each String like java first and then code
            String revWord = "";
            for (int i = word.length()-1 ; i >= 0; i--){
                revWord = revWord + word.charAt(i);
            }
            output = output + revWord+" ";
        }
        System.out.println("output = " + output);
    }
}
