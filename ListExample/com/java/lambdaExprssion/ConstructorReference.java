package com.java.lambdaExprssion;

class Sample{
    Sample(){
        System.out.println("constructor sample class execution.....!");
    }
}

interface Interfac1{
    public Sample get();
}
public class ConstructorReference {
    public static void main(String[] args) {

        Interfac1 i =Sample::new;
       Sample s1 = i.get();
        Sample s2 = i.get();
        Sample s3 = i.get();
        Sample s4 = i.get();


    }

}
