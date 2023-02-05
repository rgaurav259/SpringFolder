package com.test.Basic;

public class ReverseAString {
    public static void main(String[] args) {

        String s ="madam";
        String rev ="";
        for(int i= s.length()-1; i>=0; i--){
            rev = rev+s.charAt(i);
        }
        System.out.println("rev = " + rev);
        if (rev.equals(s)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
