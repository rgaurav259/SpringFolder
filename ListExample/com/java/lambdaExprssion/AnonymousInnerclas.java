package com.java.lambdaExprssion;

public class AnonymousInnerclas {
    public static void main(String[] args) {

        Runnable r = new Runnable() {//if we have end semicolon then it is not nonymous
            //implementaion class not having name
            @Override
            public void run() {
                for (int i =0;i<10;i++){
                    System.out.println("child thread");
                }
            }
        }; //semicolon is importanat because runnable is interface
        Thread t = new Thread(r);
        t.start();
        //main thread responsible to execute below loop

        for (int i =0;i<10;i++){
            System.out.println("main Thread");
        }


    }
}
