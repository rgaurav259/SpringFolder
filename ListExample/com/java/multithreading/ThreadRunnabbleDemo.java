package com.java.multithreading;

public class ThreadRunnabbleDemo {
    public static void main(String[] args) {
        Runnable greeter = new Greeter();
        Thread getThread = new Thread(greeter);
        getThread.start();
    }
}


class Greeter implements Runnable{

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("Hello from current thread " + name);

    }
}