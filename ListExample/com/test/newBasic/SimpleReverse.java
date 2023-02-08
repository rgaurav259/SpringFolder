package com.test.newBasic;

public class SimpleReverse {

    public static void simpleReverse(){
        String s = "madam";
        String OrgStr = s;
        String rev = "";
        int len = s.length();
        for (int i =len-1; i>=0; i--){
            rev= rev+s.charAt(i);
        }
        System.out.println("reverse is  = " + rev);
        if (OrgStr.equals(rev)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
    public static void reve(){
        String str = " Gaurav Kumar";
        char[] array = str.toCharArray();
        for (int i =array.length-1;  i>=0;  i--)
        System.out.print(" "+array[i]);
    }

    public static void main(String[] args) {
        simpleReverse();
        reve();
    }
}
