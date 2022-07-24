package com.java.Demo;

interface Interf3{
    public int squareIt(int n);
}

class Demo implements Interf3{

    @Override
    public int squareIt(int n) {
        return n*n;
    }
}

//insted of seperate class and implements the interface we can call simply lambda expression
//no need to create class

public class LambdaExpression3 {
    public static void main(String[] args) {
        Demo d = new Demo();
        int squareIt = d.squareIt(5);
        System.out.println("squareIt = " + squareIt);

        Interf3 ifff = new Demo();
        int sq = ifff.squareIt(16);
        System.out.println("squre is = " + sq);

        //now using lambda

        Interf3 x = n->n*n;//if a method of onle one parameter then we don't need to braces
        System.out.println("using lambda:"+x.squareIt(8));
        System.out.println("using lambda:"+x.squareIt(10));
        System.out.println("using lambda:"+x.squareIt(25));



    }
    //normal method call using class object and using interface reference
    
    
}
