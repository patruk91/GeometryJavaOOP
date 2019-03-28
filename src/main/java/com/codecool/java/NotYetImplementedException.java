package com.codecool.java;

public class NotYetImplementedException extends RuntimeException {

    public NotYetImplementedException(){
        throw new IllegalArgumentException("All arguments must be greater than 0");
    }
}
