package com.codecool.java.geometry.containers;

import com.codecool.java.geometry.shapes.Circle;
import com.codecool.java.geometry.shapes.Shape;

import java.math.RoundingMode;
import java.text.DecimalFormat;
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

    public Shape getLargestShapeByPerimeter() {
        if (this.shapes.size() > 0) {
            Shape biggestPerimeter = this.shapes.get(0);
            for (Shape shape : this.shapes) {
                if (shape.calculatePerimeter() > biggestPerimeter.calculatePerimeter()) {
                    biggestPerimeter = shape;
                }
            }
            return biggestPerimeter;
        } else {
            return new Circle();
        }

    }

    public Shape getLargestShapeByArea() {
        if (this.shapes.size() > 0) {
            Shape biggestArea = this.shapes.get(0);
            for (Shape shape : this.shapes) {
                if (shape.calculateArea() > biggestArea.calculateArea()) {
                    biggestArea = shape;
                }
            }
            return biggestArea;
        } else {
            return new Circle();
        }
    }

    public String getShapesTable() {
        return "make a table";
    }

    private int[] getColumnsWidth() {
        int[] columnsWidth = getHeaderColumnsLenght();

        for (Shape shape : this.shapes) {
            for (int i = 0; i < shape.tableLength().length; i++) {
                if (shape.tableLength()[i] > columnsWidth[i + 1]) {
                    columnsWidth[i + 1] = shape.tableLength()[i];
                }
            }
        }

        return columnsWidth;
    }

    private int[] getHeaderColumnsLenght() {
        int[] headersLength = new int[7];
        String[] headers = {"idx", "Class", "toString", "Perimeter", "Formula", "Area", "Formula"};

        for (int i = 0; i < headers.length; i++) {
            headersLength[i] = headers[i].length();
        }
        return headersLength;
    }
}

