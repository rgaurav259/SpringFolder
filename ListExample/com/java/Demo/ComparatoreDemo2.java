package com.java.Demo;


/* write a program to insert string and stringbuffer objects into treeset where sorting order
*  is increasing length order .if two objects having same length then consider their alphabetical order*/
import java.util.Comparator;
import java.util.TreeSet;

public class ComparatoreDemo2 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        int l1 =s1.length();
        int l2 =s2.length();
        if (l1 < l2)
            return -1;
        else if (l1 > l2)
            return +1;
        else
            return s1.compareTo(s2);//because if we return zero then it will treat as duplicate so compareto method return different values
    //t = [A, AA, XX, ABC, ABCD]
        // if we return zero then output is t = [A, AA, ABC, ABCD]

    }


    public static void main(String[] args) {
        TreeSet t = new TreeSet(new ComparatoreDemo2());
        t.add("A");
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("AA"));
        t.add("XX");
        t.add("ABCD");
        t.add("A");
        System.out.println("t = " + t);
        //t = [A, AA, XX, ABC, ABCD]

    }
}
