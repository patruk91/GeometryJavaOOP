package com.codecool.java.geometry;

import com.codecool.java.geometry.containers.ShapeList;
import com.codecool.java.ui.Handler;
import com.codecool.java.ui.Reader;
import com.codecool.java.ui.View;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        Reader reader = new Reader(view);
        Handler handler = new Handler(view, reader);
	    ShapeList shapes = new ShapeList();
	    boolean isRunning = true;


	    while (isRunning) {
	        view.clearScreen();
            view.printMenu();
            int option = reader.getIntFromUser("Option", 0, 5);
            view.clearScreen();

            switch (option) {
                case 1:
                    view.printShapes();
                    int addOption = reader.getIntFromUser("Option", 1, 6);
                    view.clearScreen();
                    handler.handleAddShape(addOption, shapes);
                    break;
                case 2:
                    shapes.getShapesTable(); //fix function get here string and print it in viewer
                    reader.promptEnterKey();

                    break;
                case 3:
                    view.printMessage("Largest perimeter: " + shapes.getLargestShapeByPerimeter().calculatePerimeter() + "\n");
                    reader.promptEnterKey();
                    break;
                case 4:
                    view.printMessage("Largest area: " + shapes.getLargestShapeByArea().calculateArea() + "\n");
                    reader.promptEnterKey();
                    break;
                case 5:
                    view.printShapes();
                    int formulaOption = reader.getIntFromUser("Option", 1, 6);
                    view.clearScreen();
                    handler.handleFormulas(formulaOption);
                    reader.promptEnterKey();
                    break;
                case 0:
                    isRunning = false;
                    break;

            }
        }
    }
}
