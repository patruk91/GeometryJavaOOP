package com.codecool.java.geometry.shapes;

public class Triangle extends Shape {
    private float a;
    private float b;
    private float c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        float s = (a + b + c) / 2;
        return Math.sqrt(s * (s -a) * (s - b) * (s - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public String getAreaFormula() {
        return "s = (a+b+c)/2\n" +
                "sqrt(s×(s-a)×(s-b)×(s-c)";
    }

    @Override
    public String getPerimeterFormula() {
        return "a+b+c";
    }
}
