package com.java.lambdaExprssion;

class ReferenceMethod{
    public static void m1(){
        for (int i=0;i<10;i++){
            System.out.println("child thread");
        }
    }
}

public class MethodReferenceLambda {

    public static void main(String[] args) {

        Runnable r =ReferenceMethod ::m1;//using method reference

        Thread t = new Thread(r);
        t.start();

        for (int i=0;i<10;i++){
            System.out.println("main thread");
        }

    }
}
