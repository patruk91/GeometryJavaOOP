package com.codecool.java.ui;

public class Validator {

    public boolean validateString(String input) {
        return !input.isEmpty();
    }

    public boolean isNumeric(String input) {
        return input.matches("[\\d]+");
    }

    public boolean isNumericFloat(String strNum) {
        return strNum.matches("-?\\d+(\\.\\d+)?");
    }

    public boolean isNumberInRange(int start, int end, int input) {
        return (start <= input && input <= end);
    }

    public boolean isNumberInRange(float start, float end, float input) {
        return (start < input && input <= end);
    }
}
