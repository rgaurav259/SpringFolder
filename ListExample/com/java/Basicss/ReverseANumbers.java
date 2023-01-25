package com.java.Basicss;

public class ReverseANumbers {
    public static void main(String[] args) {

        int num =121;
        int org_num= num;
        int rev =0;
        while (num!=0){
           rev=  rev*10+num%10;
           num=num/10;
        }
        System.out.println("rev = " + rev);
        //now using sringBuffer
//        StringBuffer sb = new StringBuffer(String.valueOf(num));
//        StringBuffer reverse = sb.reverse();
//        System.out.println("reverse = " + reverse);
        //now using StringBuilder
//        StringBuilder sbs = new StringBuilder();
//        StringBuilder append = sbs.append(num);
//        System.out.println("reverse = " + append.reverse());
        //now check palindrome
        if(org_num==rev){
            System.out.println("number is plindrome");
        }else{
            System.out.println("not palindrome");
        }


    }
}
