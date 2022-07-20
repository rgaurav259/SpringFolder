package com.java.Demo;

public class CompareToExample {
    public static void main(String[] args) {
        System.out.println("A".compareTo("Z")); //-ve
        System.out.println("Z".compareTo("K"));//+ve
        System.out.println("A".compareTo("A")); //0 which means equal and duplicate value
       // System.out.println("A".compareTo(null));
    }
}
