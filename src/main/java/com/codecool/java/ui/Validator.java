package com.codecool.java.ui;

public class Validator {

    public boolean validateString(String input) {
        return !input.isEmpty();
    }

    public boolean isNumeric(String input) {
        return input.matches("[\\d]+");
    }

    public boolean isNumberInRange(int start, int end, int input) {
        return (start <= input && input <= end);
    }
}
