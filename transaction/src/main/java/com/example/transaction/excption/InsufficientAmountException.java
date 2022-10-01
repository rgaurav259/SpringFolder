package com.example.transaction.excption;

public class InsufficientAmountException extends RuntimeException{

    public InsufficientAmountException(String msg) {
        super(msg);
    }
}
