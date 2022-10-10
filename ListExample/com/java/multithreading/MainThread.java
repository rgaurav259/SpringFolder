package com.java.multithreading;

public class MainThread {
    public static void main(String[] args) {
        Thread currentThred = Thread.currentThread();
        System.out.println(" current thred is "  + currentThred.getName());
    }
}
