package com.java.Demo;

@FunctionalInterface
interface  Interf{
    public void m1();
}

//class B implements Interf{
//
//    @Override
//    public void m1() {
//        System.out.println("hello from without lambda");
//    }
//}
//instead of class b implemenrs an all we can write lamdbad expression just one line code
public class LambdaExpression1 {

    public static void main(String[] args) {

//        B b = new B();
//        b.m1();
        Interf i = ()->System.out.println("hello from lambda");
        i.m1();


    }
}
