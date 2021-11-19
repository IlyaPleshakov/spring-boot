package com.example.demo.service.exception_handling;

public class NoSuchProductNameException extends RuntimeException{
    public NoSuchProductNameException(String message) {
        super(message);
    }
}
