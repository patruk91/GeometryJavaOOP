package com.codecool.java.geometry.shapes;

public class RegularPentagon extends Shape {
    private float a;

    public RegularPentagon(float a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return (Math.pow(a, 2)* Math.sqrt(5 * (5 + 2 * Math.sqrt(5)))) / 4;
    }

    @Override
    public double calculatePerimeter() {
        return 5 * a;
    }

    @Override
    public String getAreaFormula() {
        return "(a^2×sqrt(5×(5+2×sqrt(5))))/4";
    }

    @Override
    public String getPerimeterFormula() {
        return "5×a";
    }
}
