package com.java.lambdaExprssion;


class ReferenceMethodInstancmethod{
    public void instancemethod(){
        for (int i =0;i<10;i++){
            System.out.println("child thread");
        }
    }
}
public class MethodReferenceLambdainstancemethod {
    public static void main(String[] args) {
        ReferenceMethodInstancmethod rf = new ReferenceMethodInstancmethod();
        //instance method of calling first we have to create an object and refernce then object reference method
        Runnable r =rf::instancemethod;
        Thread t = new Thread(r);
        t.start();
        for (int i=0;i<10;i++){
            System.out.println("main thredad");
        }

    }
}
