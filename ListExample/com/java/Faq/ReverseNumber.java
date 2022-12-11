package com.java.Faq;

public class ReverseNumber {
    public static void main(String[] args) {
        int n =153;
        int org_number=n;
        int rev =0;
        while (n !=0){
             rev = rev*10 +n %10;
             n= n/10;
        }
        //System.out.println("rev = " + rev);
        if (rev == org_number){
            System.out.println("palindrome number");
        }
        else {
            System.out.println("not palindrome number");

        }
//        StringBuffer sb = new StringBuffer();
//        StringBuffer rev = sb.append(n);
//        System.out.println("reverse is  = " + rev.reverse());
        
//        StringBuilder sb = new StringBuilder();
//        StringBuilder append = sb.append(n);
//        System.out.println("sb.reverse(n) = " + append.reverse());

//        StringBuffer sbs = new StringBuffer(String.valueOf(n));
//        StringBuffer reverse = sbs.reverse();
//        System.out.println("reverse = " + reverse);
    }
}
