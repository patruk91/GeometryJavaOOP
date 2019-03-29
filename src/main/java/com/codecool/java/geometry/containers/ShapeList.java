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
        String format = "";
        int sum = 0;

        for (int columnWidth : getColumnsWidth()) {
            format += "%-" + columnWidth + "s |";
            sum += columnWidth;
        }
        format += "%n";
        return getTableString(format, sum);
    }

    private String getTableString(String format, int sum) {
        StringBuilder stringBuilder = new StringBuilder();
        int extraSpaces = 7 + 7; //vertical line, spaces
        int i = 0;

        stringBuilder.append(horizontalLine(sum, extraSpaces));
        stringBuilder.append(getHeaderString(format));
        stringBuilder.append(horizontalLine(sum, extraSpaces));
        for (Shape line : this.shapes) {
            String tableRow = String.format(format, "| " + i,
                    line.getClassName(), line.toString(), decimalFormat(line.calculatePerimeter()),
                    line.getPerimeterFormula(), decimalFormat(line.calculateArea()), line.getAreaFormula());
            stringBuilder.append(tableRow);

            i++;
            stringBuilder.append(horizontalLine(sum, extraSpaces));
        }
        return stringBuilder.toString();
    }

    private String getHeaderString(String format) {
        String[] headers = {"| idx", "Class", "toString", "Perimeter", "Formula", "Area", "Formula"};
        return String.format(format, headers);
    }

    private String horizontalLine(int sum , int extraSpaces) {
        return "-".repeat(sum + extraSpaces) + "\n";
    }


    private String decimalFormat(double number) {
        DecimalFormat df = new DecimalFormat("#.0000");
        df.setRoundingMode(RoundingMode.CEILING);
        return df.format(number);
    }

    private int[] getColumnsWidth() {
        int[] columnsWidth = {5, 5, 8, 9, 7, 4, 7};
        // numbers due to headers length in table

        for (Shape shape : this.shapes) {
            for (int i = 0; i < shape.calculateColumnsWidth().length; i++) {
                if (shape.calculateColumnsWidth()[i] > columnsWidth[i + 1]) {
                    columnsWidth[i + 1] = shape.calculateColumnsWidth()[i];
                }
            }
        }
        return columnsWidth;
    }
}

