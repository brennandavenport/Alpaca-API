package com.brennan.exceptions;

public class NoOrderIdException extends RuntimeException{
    public NoOrderIdException(String message) {
        super(message);
    }
}
