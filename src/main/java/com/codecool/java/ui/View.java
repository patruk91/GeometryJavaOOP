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

    public void printMessageWithNewLine(String message) {
        System.out.println(message);
    }


    public void printQuestion(String question) {
        System.out.print(question + "?: ");
    }

    public void printError(String error) {
        System.out.println(("Error: " + error));
    }

    public void printShapes() {
        System.out.println("Shapes:\n" +
                "   (1) Circle\n" +
                "   (2) Triangle\n" +
                "   (3) Equilateral triangle\n" +
                "   (4) Rectangle\n" +
                "   (5) Square\n" +
                "   (6) Regular pentagon");
    }
}
