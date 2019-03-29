package com.codecool.java.geometry.containers;

import com.codecool.java.geometry.shapes.Shape;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

public class TableFormatter {
    private String format;
    private int sum;
    private List<Shape> shapes;

    public TableFormatter(List<Shape> shapes){
        this.format = "";
        this.sum = 0;
        this.shapes = shapes;
        calculateFormat();
    }

    private void calculateFormat() {
        this.format = "";
        this.sum = 0;

        for (int columnWidth : getColumnsWidth()) {
            this.format += "%-" + columnWidth + "s |";
            this.sum += columnWidth;
        }
        this.format += "%n";
    }

    public String getFormat() {
        return format;
    }

    public int getSum() {
        return sum;
    }

    public String getTableString(String format, int sum) {
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
