package com.java.Demo;

//class MyRunnable implements Runnable{
//
//    @Override
//    public void run() {
//        for (int i =0;i<10;i++){
//            System.out.println("child Thread");
//        }
//    }
//}

public class LambdaExpressionMultiThreading {
    public static void main(String[] args) {
//        MyRunnable r = new MyRunnable();
//        Thread t = new Thread(r);
//        t.start();
        // main thred start
//        for (int i =0;i<10; i++){
//            System.out.println("main thread");
//        }


        //we can directly implements lambda

        Runnable r =()->{
            for (int i =0;i<10;i++){
                System.out.println("child thread");
            }
        };
        Thread t = new Thread(r);
        t.start();
        for (int i =0;i<10; i++){
            System.out.println("main thread");
        }

    }
}
