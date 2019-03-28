package com.codecool.java.geometry.shapes;

import com.codecool.java.NotYetImplementedException;

public class Rectangle extends Shape {
    private float a;
    private float b;

    public Rectangle(float a, float b) {
        if (!Shape.checkIfArgsGreaterThanZero(a, b)) {
            throw new NotYetImplementedException();
        }
        this.a = a;
        this.b = b;
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
        return a;
    }

    float getB() {
        return b;
    }
}
