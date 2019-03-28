package com.codecool.java.geometry.containers;

import com.codecool.java.geometry.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeList {
    List<Shape> shapes;

    public ShapeList() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    public Shape getShapeAt(int index) {
        return shapes.get(index);
    }

    public String getShapesTable() {
        return "make a table";
    }

    public Shape getLargestShapeByPerimeter() {
        Shape biggestPerimeter = shapes.get(0);
        for (Shape shape : this.shapes) {
            if (shape.calculatePerimeter() > biggestPerimeter.calculatePerimeter()) {
                biggestPerimeter = shape;
            }
        }
        return biggestPerimeter;
    }

    public Shape getLargestShapeByArea() {
        Shape biggestArea = shapes.get(0);
        for (Shape shape : this.shapes) {
            if (shape.calculateArea() > biggestArea.calculateArea()) {
                biggestArea = shape;
            }
        }
        return biggestArea;
    }
}
