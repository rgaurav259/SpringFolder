package com.java.basics;

public class ReverseStrings {
    public static void main(String[] args) {
        String str = "madam";
        int len =str.length();
        String rev ="";
        for (int i =len-1;i>=0;i--){
            rev =rev+str.charAt(i);

        }
        System.out.println(rev);
        if (str.equals(rev)){
            System.out.println("string is palindrome");
        }else {
            System.out.println("not palindrome");
        }
        
        StringBuffer sb = new StringBuffer(str);
        StringBuffer reverse = sb.reverse();
        System.out.println("reverse using StringBuffer = " + reverse);

    }
}
