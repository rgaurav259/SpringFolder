package com.java.BasicPrograms;

public class StringExample2 {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = new String("abc");
        System.out.print(s1==s2);
        System.out.println(s1==s2.intern());
//        The s1 is in the string pool whereas s2 is created in heap memory.
//
//        Hence s1==s2 will return false.
//
//                When s2.intern() method is called, it checks if there is any string with value “abc” in the pool. So it returns the reference of s1. So both s1 and s2 are pointing to the same string instance now.
//
//                Hence s1==s2.intern() will return true.

        //-----------------------
        String s3 = new String("java");
        String s4 = new String("JAVA");
        System.out.println(s3 = s4);//It will print “JAVA” because the argument inside the println() method is an assignment. So it will be treated as System.out.println("JAVA").


        String s5 = "abc";
        StringBuffer s6 = new StringBuffer(s1);
        System.out.println(s5.equals(s6));

    }
}
