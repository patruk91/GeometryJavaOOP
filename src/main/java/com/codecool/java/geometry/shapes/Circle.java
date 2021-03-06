package com.codecool.java.geometry.shapes;

import com.codecool.java.NotYetImplementedException;

public class Circle extends Shape {
    private float r;

    public Circle() {
    }

    public Circle(float r) {
        if (Shape.checkIfArgsGreaterThanZero(r)) {
            this.r = r;
        }
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.r, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.r;
    }

    @Override
    public String getAreaFormula() {
        return "π×r^2";
    }

    @Override
    public String getPerimeterFormula() {
        return "2×π×r";
    }

    float getR() {
        return this.r;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", r = " + this.r;
    }


}
