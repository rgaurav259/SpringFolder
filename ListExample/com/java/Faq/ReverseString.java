package com.java.Faq;
public class ReverseString {
    public static void main(String[] args) {
        String str = "madam";
        int len = str.length();
        String rev ="";
        for (int i =len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        //also check palindrome
        if (str.equals(rev)){
            System.out.println("Palindrome string ");
        }
        else {
            System.out.println("Not palindrome String");

        }
        System.out.println("rev = " + rev);
//        StringBuffer sb = new StringBuffer(str);
//        System.out.println("sb.reverse() = " + sb.reverse());
//        StringBuilder sbs = new StringBuilder(str);
//        StringBuilder reverse = sbs.reverse();
//        System.out.println("reverse = " + reverse);

    }
}
