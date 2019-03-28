package com.codecool.java.geometry.shapes;

import com.codecool.java.NotYetImplementedException;

public class Triangle extends Shape {
    private float a;
    private float b;
    private float c;

    public Triangle(float a, float b, float c) {
        if (!Shape.checkIfArgsGreaterThanZero(a, b, c)) {
            throw new NotYetImplementedException();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        float s = (this.a + this.b + this.c) / 2;
        return Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
    }

    @Override
    public double calculatePerimeter() {
        return this.a + this.b + this.c;
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

    float getA() {
        return a;
    }

    float getB() {
        return b;
    }

    float getC() {
        return c;
    }
}
