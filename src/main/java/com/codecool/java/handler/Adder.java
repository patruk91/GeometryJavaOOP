package com.codecool.java.handler;

import com.codecool.java.geometry.containers.ShapeList;
import com.codecool.java.geometry.shapes.*;
import com.codecool.java.ui.Reader;
import com.codecool.java.ui.View;

public class Adder {
    private Reader reader;

    public Adder(Reader reader) {
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

    private void addCircle(float minValue, ShapeList shapeList) {
        float radius = this.reader.getFloatParameters("Please provide a radius: ",
                minValue, Float.MAX_VALUE);
        Circle circle = new Circle(radius);
        shapeList.addShape(circle);
    }

    private void addTriangle(float minValue, ShapeList shapeList) {
        float aTriangle = this.reader.getFloatParameters(
                "Please provide the first side of the triangle: ", minValue, Float.MAX_VALUE);
        float bTriangle = this.reader.getFloatParameters
                ("Please provide the second side of the triangle: ", minValue, Float.MAX_VALUE);
        float cTriangle = this.reader.getFloatParameters(
                "Please provide the third side of the triangle: ", minValue, Float.MAX_VALUE);
        Triangle triangle = new Triangle(aTriangle, bTriangle, cTriangle);
        shapeList.addShape(triangle);
    }

    private void addEquilateralTriangle(float minValue, ShapeList shapeList) {
        float aEquilateralTriangle = this.reader.getFloatParameters(
                "Please provide the side of the triangle: ", minValue, Float.MAX_VALUE);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(aEquilateralTriangle);
        shapeList.addShape(equilateralTriangle);
    }

    private void addRectangle(float minValue, ShapeList shapeList) {
        float aRectangle = this.reader.getFloatParameters(
                "Please provide the first side of the rectangle: ", minValue, Float.MAX_VALUE);
        float bRectangle = this.reader.getFloatParameters(
                "Please provide the second side of the rectangle: ", minValue, Float.MAX_VALUE);
        Rectangle rectangle = new Rectangle(aRectangle, bRectangle);
        shapeList.addShape(rectangle);
    }

    private void addSquare(float minValue, ShapeList shapeList) {
        float aSquare = this.reader.getFloatParameters("Please provide side of the square: ", minValue, Float.MAX_VALUE);
        Square square = new Square(aSquare);
        shapeList.addShape(square);
    }

    private void addPentagon(float minValue, ShapeList shapeList) {
        float aPentagon = this.reader.getFloatParameters("Please provide side of the pentagon: ", minValue, Float.MAX_VALUE);
        RegularPentagon regularPentagon = new RegularPentagon(aPentagon);
        shapeList.addShape(regularPentagon);
    }
}
