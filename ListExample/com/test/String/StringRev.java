package com.test.String;

public class StringRev {

    public static void strRev(){
        String s = "gaurav";

        char[] chars = s.toCharArray();
        for (int i = chars.length-1; i>=0;i--){
//            char c = s.charAt(i);
//            System.out.print(""+ c);
            System.out.print(" " + chars[i]);
        }
    }
    public static void main(String[] args) {

        strRev();
    }
}
