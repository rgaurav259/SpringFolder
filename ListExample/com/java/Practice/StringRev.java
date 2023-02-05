package com.java.Practice;

public class StringRev {

        public static void main(String[] args) {
            String input = "Gaurav";
//            char[] array = input.toCharArray();
//            for (int i = array.length-1; i>=0; i--){
//                System.out.print(array[i]);
//            }


            String str = "Gaurav";
            String org_str = str;
            int n = str.length();
            String rev = "";
            for (int i =n-1 ;i>=0;i--){
                rev += str.charAt(i);

            }
            System.out.println(rev);

            if (org_str.equals(rev)){
                System.out.println("palindrome");
            }else{
                System.out.println("not palindrome");
            }

        }



}
