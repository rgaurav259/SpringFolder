package com.java.Demo;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack st= new Stack<>();
        st.push("A");
        st.push("B");
        st.push("C");
        System.out.println(st);
        System.out.println(st.search("A"));
        System.out.println(st.search("B"));
        System.out.println(st.search("Z"));//-1 because not present value in stack



    }
}
