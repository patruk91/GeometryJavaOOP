package com.codecool.java.handler;

import com.codecool.java.geometry.shapes.*;
import com.codecool.java.ui.View;

public class ShapeFormulas {

    private View view;

    public ShapeFormulas(View view) {
        this.view = view;
    }

    public void handleFormulas(int option) {
        switch (option) {
            case 1:
                circleFormula();
                break;
            case 2:
                triangleFormula();
                break;
            case 3:
                equilateralTriangleFormula();
                break;
            case 4:
                rectangleFormula();
                break;
            case 5:
                squareFormula();
                break;
            case 6:
                regularPentagonFormula();
                break;
        }
    }

    private void circleFormula() {
        Circle circle = new Circle();
        this.view.printMessageWithNewLine("Circle area formula: "
                + circle.getAreaFormula());
        this.view.printMessageWithNewLine("Circle perimeter formula: "
                + circle.getPerimeterFormula());
    }

    private void triangleFormula() {
        Triangle triangle = new Triangle();
        this.view.printMessageWithNewLine("Triangle area formula: "
                + triangle.getAreaFormula());
        this.view.printMessageWithNewLine("Triangle perimeter formula: "
                + triangle.getPerimeterFormula());
    }

    private void equilateralTriangleFormula() {
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
        this.view.printMessageWithNewLine("Equilateral triangle area formula: "
                + equilateralTriangle.getAreaFormula());
        this.view.printMessageWithNewLine("Equilateral triangle perimeter formula: "
                + equilateralTriangle.getPerimeterFormula());
    }

    private void rectangleFormula() {
        Rectangle rectangle = new Rectangle();
        this.view.printMessageWithNewLine("Rectangle area formula: "
                + rectangle.getAreaFormula());
        this.view.printMessageWithNewLine("Rectangle perimeter formula: "
                + rectangle.getPerimeterFormula());
    }

    private void squareFormula() {
        Square square = new Square();
        this.view.printMessageWithNewLine("Square area formula: "
                + square.getAreaFormula());
        this.view.printMessageWithNewLine("Square perimeter formula: "
                + square.getPerimeterFormula());
    }

    private void regularPentagonFormula() {
        RegularPentagon regularPentagon = new RegularPentagon();
        this.view.printMessageWithNewLine("Regular pentagon area formula: " + regularPentagon.getAreaFormula());
        this.view.printMessageWithNewLine("Regular pentagon formula: " + regularPentagon.getPerimeterFormula());
    }
}
