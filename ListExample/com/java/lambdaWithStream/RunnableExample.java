package com.java.lambdaWithStream;

public class RunnableExample {
    public static void main(String[] args) {
//before java 8
      Runnable t1=  new Runnable(){

            @Override
            public void run() {
                System.out.println("thread 1");
            }
        };
      new Thread(t1).start();

        //after
        Runnable t2 =()->{System.out.println("thred2");};
        new Thread(t2).start();
    }


}
