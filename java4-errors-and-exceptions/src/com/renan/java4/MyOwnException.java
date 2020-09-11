package com.renan.java4;

public class MyOwnException extends RuntimeException {

    public MyOwnException() {
    }

    public MyOwnException(String message) {
        super(message);
    }
}
