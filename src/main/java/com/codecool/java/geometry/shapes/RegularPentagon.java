package com.codecool.java.geometry.shapes;

import com.codecool.java.NotYetImplementedException;

public class RegularPentagon extends Shape {
    private float a;

    public RegularPentagon(float a) {
        if (!Shape.checkIfArgsGreaterThanZero(a)) {
            throw new NotYetImplementedException();
        }
        this.a = a;
    }

    public RegularPentagon() {}

    @Override
    public double calculateArea() {
        return (Math.pow(this.a, 2)* Math.sqrt(5 * (5 + 2 * Math.sqrt(5)))) / 4;
    }

    @Override
    public double calculatePerimeter() {
        return 5 * this.a;
    }

    @Override
    public String getAreaFormula() {
        return "(a^2×sqrt(5×(5+2×sqrt(5))))/4";
    }

    @Override
    public String getPerimeterFormula() {
        return "5×a";
    }

    float getA() {
        return a;
    }
}
