package com.codecool.java.geometry.shapes;


import com.codecool.java.NotYetImplementedException;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * This is a abstract class representing geometrical shape.
 */
public abstract class Shape implements ClassName{
    /**
     * Calculates shape's area.
     * @return area of the shape
     */
    public abstract double calculateArea();

    /**
     * Calculates shape's perimeter.
     * @return perimeter of the shape
     */
    public abstract double calculatePerimeter();

    /**
     * Returns formula for the area of the shape as a string.
     * @return area formula
     */
    public abstract String getAreaFormula();
    
    /**
     * Returns formula for the perimeter of the shape as a string.
     * @return perimeter formula
     */
    public abstract String getPerimeterFormula();

    /**
     * Check if any of args are not below 0.
     * Throws IllegalArgumentException if any of the parameters is 0 or less.
     * @param args
     * @return true if any of args are greater than 0
     */
    public static boolean checkIfArgsGreaterThanZero(float... args) {
        for (float arg : args) {
            if (arg <= 0) {
                throw new NotYetImplementedException();
            }
        }
        return true;
    }

    public int[] tableLength() {
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);
        int placesAfterDecimal = 6;
        int[] tableColumns = {getClassName().length(), toString().length(),
                df.format(calculatePerimeter()).length() + placesAfterDecimal, getPerimeterFormula().length(),
                df.format(calculateArea()).length() + placesAfterDecimal, getAreaFormula().length()};
        return tableColumns;
    }

    @Override
    public abstract String toString();
}
