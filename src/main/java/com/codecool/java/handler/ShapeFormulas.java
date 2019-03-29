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
        view.printMessageWithNewLine("Circle area formula: "
                + circle.getAreaFormula());
        view.printMessageWithNewLine("Circle perimeter formula: "
                + circle.getPerimeterFormula());
    }

    private void triangleFormula() {
        Triangle triangle = new Triangle();
        view.printMessageWithNewLine("Triangle area formula: "
                + triangle.getAreaFormula());
        view.printMessageWithNewLine("Triangle perimeter formula: "
                + triangle.getPerimeterFormula());
    }

    private void equilateralTriangleFormula() {
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
        view.printMessageWithNewLine("Equilateral triangle area formula: "
                + equilateralTriangle.getAreaFormula());
        view.printMessageWithNewLine("Equilateral triangle perimeter formula: "
                + equilateralTriangle.getPerimeterFormula());
    }

    private void rectangleFormula() {
        Rectangle rectangle = new Rectangle();
        view.printMessageWithNewLine("Rectangle area formula: "
                + rectangle.getAreaFormula());
        view.printMessageWithNewLine("Rectangle perimeter formula: "
                + rectangle.getPerimeterFormula());
    }

    private void squareFormula() {
        Square square = new Square();
        view.printMessageWithNewLine("Square area formula: "
                + square.getAreaFormula());
        view.printMessageWithNewLine("Square perimeter formula: "
                + square.getPerimeterFormula());
    }

    private void regularPentagonFormula() {
        RegularPentagon regularPentagon = new RegularPentagon();
        view.printMessageWithNewLine("Regular pentagon area formula: " + regularPentagon.getAreaFormula());
        view.printMessageWithNewLine("Regular pentagon formula: " + regularPentagon.getPerimeterFormula());
    }
}
