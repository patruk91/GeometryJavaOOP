package com.codecool.java.geometry.shapes;

public class EquilateralTriangle extends Triangle {
    private float a;

    public EquilateralTriangle(float a) {
        super(a, a, a);
        this.a = a;
    }

    public EquilateralTriangle() {}

}
