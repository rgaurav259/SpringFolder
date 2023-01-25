package com.java.Basicss;

public class LargestNumOf3 {
    public static void main(String[] args) {

        int a=1,b=20,c=5;
        if(a>b && a>c){
            System.out.println("a is greater = " + a);
        } else if (b>c && b>a) {
            System.out.println("b is greater "+b);
        }
        else {
            System.out.println("c is greater"+c);
        }
    }
}
