package com.java.BasicPrograms;

import java.util.Objects;

public class StringEqualsCheck {
    public static void main(String[] args) {

        String s1 = new String("gaurav");
        String s2 = new String("gaurav");
        System.out.println(s1==s2);//reference compariosn  false
        //because they both are refered different objects.
        System.out.println(s1.equals(s2)); //true because equals method check contents
        //now another way
        String str1 = "gaurav";
        String str2 = "gaurav"; //it will create an object only scp area that's why its return true
        System.out.println(str1==str2);
        System.out.println(s1.equals(s2));

        String s =null;
        try {
            System.out.println(s.length());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
