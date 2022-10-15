package com.gaurav.blog.exceptions;

public class ApiEception  extends RuntimeException{

    public ApiEception(String message) {
        super(message);
    }

    public ApiEception() {
        super();
    }
}
