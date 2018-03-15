package com.codecool.java.geometry.shapes;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * This is a abstract class representing geometrical shape.
 */
public abstract class Shape {
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
     * Check if any of args are not below 0.
     * Throws IllegalArgumentException if any of the parameters is 0 or less.
     * @param args
     * @return true if any of args are greater than 0
     */
    public static boolean checkIfArgsGreaterThanZero(float... args) {
        throw new NotImplementedException();
    }

    /**
     * Returns formula for the area of the shape as a string.
     * @return area formula
     */
    public static String getAreaFormula() {
        throw new NotImplementedException();
    }

    /**
     * Returns formula for the perimeter of the shape as a string.
     * @return perimeter formula
     */
    public static String getPerimeterFormula() {
        throw new NotImplementedException();
    }
}
