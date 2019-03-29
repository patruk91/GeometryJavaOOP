package com.codecool.java.ui;

import com.codecool.java.geometry.containers.ShapeList;
import com.codecool.java.geometry.shapes.*;

public class Handler {
    private View view;
    private Reader reader;

    public Handler(View view, Reader reader) {
        this.view = view;
        this.reader = reader;
    }
    
    public void handleAddShape(int option, ShapeList shapeList) {
        float minValue = 0;

        switch (option) {
            case 1:
                addCircle(minValue, shapeList);
                break;
            case 2:
                addTriangle(minValue, shapeList);
                break;
            case 3:
                addEquilateralTriangle(minValue, shapeList);
                break;
            case 4:
                addRectangle(minValue, shapeList);
                break;
            case 5:
                addSquare(minValue,shapeList);
                break;
            case 6:
                addPentagon(minValue, shapeList);
                break;
        }
    }

    public void addCircle(float minValue, ShapeList shapeList) {
        float radius = reader.getFloatParameters("Please provide a radius: ",
                minValue, Float.MAX_VALUE);
        Circle circle = new Circle(radius);
        shapeList.addShape(circle);
    }

    public void addTriangle(float minValue, ShapeList shapeList) {
        float aTriangle = reader.getFloatParameters(
                "Please provide the first side of the triangle: ", minValue, Float.MAX_VALUE);
        float bTriangle = reader.getFloatParameters
                ("Please provide the second side of the triangle: ", minValue, Float.MAX_VALUE);
        float cTriangle = reader.getFloatParameters(
                "Please provide the third side of the triangle: ", minValue, Float.MAX_VALUE);
        Triangle triangle = new Triangle(aTriangle, bTriangle, cTriangle);
        shapeList.addShape(triangle);
    }

    public void addEquilateralTriangle(float minValue, ShapeList shapeList) {
        float aEquilateralTriangle = reader.getFloatParameters(
                "Please provide the side of the triangle: ", minValue, Float.MAX_VALUE);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(aEquilateralTriangle);
        shapeList.addShape(equilateralTriangle);
    }

    public void addRectangle(float minValue, ShapeList shapeList) {
        float aRectangle = reader.getFloatParameters(
                "Please provide the first side of the rectangle: ", minValue, Float.MAX_VALUE);
        float bRectangle = reader.getFloatParameters(
                "Please provide the second side of the rectangle: ", minValue, Float.MAX_VALUE);
        Rectangle rectangle = new Rectangle(aRectangle, bRectangle);
        shapeList.addShape(rectangle);
    }

    public void addSquare(float minValue, ShapeList shapeList) {
        float aSquare = reader.getFloatParameters("Please provide side of the square: ", minValue, Float.MAX_VALUE);
        Square square = new Square(aSquare);
        shapeList.addShape(square);
    }

    public void addPentagon(float minValue, ShapeList shapeList) {
        float aPentagon = reader.getFloatParameters("Please provide side of the pentagon: ", minValue, Float.MAX_VALUE);
        RegularPentagon regularPentagon = new RegularPentagon(aPentagon);
        shapeList.addShape(regularPentagon);
    }


    public void handleFormulas(int option) {
        switch (option) {
            case 1:
                Circle circle = new Circle();
                view.printMessageWithNewLine("Circle area formula: " + circle.getAreaFormula());
                view.printMessageWithNewLine("Circle perimeter formula: " + circle.getPerimeterFormula());
                break;
            case 2:
                Triangle triangle = new Triangle();
                view.printMessageWithNewLine("Triangle area formula: " + triangle.getAreaFormula());
                view.printMessageWithNewLine("Triangle perimeter formula: " + triangle.getPerimeterFormula());
                break;
            case 3:
                EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
                view.printMessageWithNewLine("Equilateral triangle area formula: " + equilateralTriangle.getAreaFormula());
                view.printMessageWithNewLine("Equilateral triangle perimeter formula: " + equilateralTriangle.getPerimeterFormula());
                break;
            case 4:
                Rectangle rectangle = new Rectangle();
                view.printMessageWithNewLine("Rectangle area formula: " + rectangle.getAreaFormula());
                view.printMessageWithNewLine("Rectangle perimeter formula: " + rectangle.getPerimeterFormula());
                break;
            case 5:
                Square square = new Square();
                view.printMessageWithNewLine("Square area formula: " + square.getAreaFormula());
                view.printMessageWithNewLine("Square perimeter formula: " + square.getPerimeterFormula());
                break;
            case 6:
                RegularPentagon regularPentagon = new RegularPentagon();
                view.printMessageWithNewLine("Regular pentagon area formula: " + regularPentagon.getAreaFormula());
                view.printMessageWithNewLine("Regular pentagon formula: " + regularPentagon.getPerimeterFormula());
                break;
        }
    }


}
