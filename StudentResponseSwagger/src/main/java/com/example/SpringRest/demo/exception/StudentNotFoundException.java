package com.example.SpringRest.demo.exception;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String messaage) {
        super(messaage);
    }
}
