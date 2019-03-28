package com.codecool.java.geometry.shapes;

public class Circle extends Shape {
    private float r;

    public Circle(float r) {
        this.r = r;
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
        return r;
    }
}
