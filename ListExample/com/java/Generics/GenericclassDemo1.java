package com.java.Generics;

import java.util.ArrayList;

public class GenericclassDemo1 <T> {

    T t;

    public GenericclassDemo1(T t) {
        this.t = t;
    }


    public void print(){
        System.out.println(t);
    }

    public static void main(String[] args) {


        GenericclassDemo1<Integer> gn = new GenericclassDemo1<>(10);

        GenericclassDemo1<String> st = new GenericclassDemo1<>("gaurv");
        GenericclassDemo1<Double> d = new GenericclassDemo1<>(2000.0);

        st.print();
        gn.print();
        d.print();


        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("name"));

        Cat mycat = cats.get(0);
        System.out.println(mycat);


    }
}
