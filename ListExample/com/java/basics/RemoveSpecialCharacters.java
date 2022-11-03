package com.java.basics;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {

        String str = "3wshshgauravkumar34923chcs///-*-*+88898884444''';/.3" +
                "+5+++55hsh@#$%$#$&&^**";
        String s = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("s = " + s);

        String s1 = str.replaceAll("[^A-Z]", "#");
        System.out.println("s1 = " + s1);

        //remove whitespace
        String strrrr = "jaa aa   avv aa aa av a a a a a a a a  aaaaaaaaaa";
        String replaceAll = strrrr.replaceAll("\\s", "");
        System.out.println("replaceAll = " + replaceAll);


    }
}
