package com.java.Generics;

import java.io.Serializable;

public class GenericBoundsType <T extends  Number & Serializable>{


    T t;

    public GenericBoundsType(T t) {
        this.t = t;
    }
    public void print(){
        System.out.println(t);
    }
}
