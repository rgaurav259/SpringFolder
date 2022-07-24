package com.java.Demo;


interface  Interf1{
    public void add(int a,int b);
}

//class Test implements Interf1{
//
//    @Override
//    public void add(int a, int b) {
//        System.out.println(a+b);
//    }
//}
//instead of seperatr class using override and implements we can just add lambda
// we can write lambda just one line using parent interface reference
//   (a,b)-> System.out.println(a+b);

public class LambdaExpression2 {
    public static void main(String[] args) {
//        Test t = new Test();
//        t.add(10,20);
//        Interf1 t1 = new Test();//parent reference can hold child objects
//        t1.add(30,40);

        Interf1 t2 =(a,b)-> System.out.println("sum is: "+(a+b));
        t2.add(30,40);

    }


}
