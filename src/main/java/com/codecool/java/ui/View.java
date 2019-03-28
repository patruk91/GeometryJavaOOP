package com.codecool.java.ui;

public class View {

    public void printMenu() {
        System.out.println("Learn geometry.\n" +
                "   What do you want to do?\n" +
                "   (1) Add new shapes\n" +
                "   (2) Show all shapes\n" +
                "   (3) Show shape with the largest perimeter\n" +
                "   (4) Show shape with the largest area\n" +
                "   (5) Show formulas\n" +
                "   (0) Exit program");
    }

    public void printMessage(String message) {
        System.out.print(message);
    }
}
