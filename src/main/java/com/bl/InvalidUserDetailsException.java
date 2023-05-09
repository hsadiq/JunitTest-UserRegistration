package com.bl;

public class InvalidUserDetailsException extends Exception {
    public InvalidUserDetailsException(String message) {
        super(message);
    }
}
