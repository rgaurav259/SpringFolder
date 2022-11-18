package com.java.BasicPrograms;

public class StringExample {
    public static void main(String[] args) {

        String s = "Java String Quiz";
        //s= String.valueOf(s.length());
        //System.out.println(s.charAt(s.toUpperCase().length()));
        System.out.println(s.charAt(s.toUpperCase().length()-1));
        String ss = "Java String Quiz";
        System.out.println(ss.substring(3,9));//start from o to n-1 index last n-1 and start 0 index;
        System.out.println(ss.substring(1,15));//start from o to n-1 index last n-1 and start 0 index;

        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");
        s1="hi";

        System.out.print(s1 == s2);
        System.out.print(s1 == s3);
        System.out.println();
        String str = new String("gaurav");
        String ssssss = str.concat("kumar");
        System.out.println(ssssss);
        System.out.println("str = " + str);
        System.out.println(ssssss==str);
        String s9 = "gauravkumar";
        System.out.println("s9==ssssss = " + s9==ssssss);//reference is not same but content is same
        System.out.println(s9.equals(ssssss));

        String x = "abc";
        String y = "abc";
        String xn=x.concat(y);
        System.out.println(xn);
        System.out.print(x);
        x.concat(y);
        System.out.println(x);




        //The x.concat(y) will create a new string but it’s not assigned to x, so the value of x is not changed


        //-------------------
        String sms1 = "abc";
        String sms2 = "abc";
        System.out.println("sms1 == sms2 is: " + sms1 == sms2);


        String q = "Java"+1+2+45+6+"Quiz"+""+(3+4);
        System.out.println(q);



    }
}
