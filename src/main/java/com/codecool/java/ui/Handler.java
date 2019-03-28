package com.codecool.java.ui;

import com.codecool.java.geometry.containers.ShapeList;
import com.codecool.java.geometry.shapes.*;

public class Handler {
//    private Circle circle;
//    private Triangle triangle;
//    private EquilateralTriangle equilateralTriangle;
//    private Rectangle rectangle;
//    private Square square;
//    private RegularPentagon regularPentagon;
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
                float radius = reader.getFloatParameters("Please provide a radius: ", minValue, Float.MAX_VALUE);
                Circle circle = new Circle(radius);
                shapeList.addShape(circle);
                break;
            case 2:
                float aTriangle = reader.getFloatParameters("Please provide the first side of the triangle: ", minValue, Float.MAX_VALUE);
                float bTriangle = reader.getFloatParameters("Please provide the second side of the triangle:: ", minValue, Float.MAX_VALUE);
                float cTriangle = reader.getFloatParameters("Please provide the third side of the triangle:: ", minValue, Float.MAX_VALUE);
                Triangle triangle = new Triangle(aTriangle, bTriangle, cTriangle);
                shapeList.addShape(triangle);
                break;
            case 3:
                float aEquilateralTriangle = reader.getFloatParameters("Please provide the side of the triangle: ", minValue, Float.MAX_VALUE);
                EquilateralTriangle equilateralTriangle = new EquilateralTriangle(aEquilateralTriangle);
                shapeList.addShape(equilateralTriangle);
                break;
            case 4:
                float aRectangle = reader.getFloatParameters("Please provide the first side of the rectangle: ", minValue, Float.MAX_VALUE);
                float bRectangle = reader.getFloatParameters("Please provide the second side of the rectangle: ", minValue, Float.MAX_VALUE);
                Rectangle rectangle = new Rectangle(aRectangle, bRectangle);
                shapeList.addShape(rectangle);
                break;
            case 5:
                float aSquare = reader.getFloatParameters("Please provide side of the square: ", minValue, Float.MAX_VALUE);
                Square square = new Square(aSquare);
                shapeList.addShape(square);
                break;
            case 6:
                float aPentagon = reader.getFloatParameters("Please provide side of the pentagon: ", minValue, Float.MAX_VALUE);
                RegularPentagon regularPentagon = new RegularPentagon(aPentagon);
                shapeList.addShape(regularPentagon);
                break;
        }
    }


}
