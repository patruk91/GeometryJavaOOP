package com.codecool.java.geometry.shapes;

import com.codecool.java.NotYetImplementedException;

public class Rectangle extends Shape {
    private float a;
    private float b;

    public Rectangle() {}

    public Rectangle(float a, float b) {
        if (Shape.checkIfArgsGreaterThanZero(a, b)) {
            this.a = a;
            this.b = b;
        }
    }

    @Override
    public double calculateArea() {
        return this.a * this.b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * this.a + 2 * this.b;
    }

    @Override
    public String getAreaFormula() {
        return "a×b";
    }

    @Override
    public String getPerimeterFormula() {
        return "2×a+2×b";
    }

    float getA() {
        return this.a;
    }

    float getB() {
        return this.b;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", a = " + this.a + ", b = " + this.b;
    }
}
