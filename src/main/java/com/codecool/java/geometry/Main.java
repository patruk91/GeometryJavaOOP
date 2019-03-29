package com.codecool.java.geometry;

import com.codecool.java.geometry.containers.ShapeList;
import com.codecool.java.handler.Adder;
import com.codecool.java.handler.ShapeFormulas;
import com.codecool.java.ui.Reader;
import com.codecool.java.ui.View;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        Reader reader = new Reader(view);
        Adder adder = new Adder(reader);
        ShapeFormulas shapeFormulas = new ShapeFormulas(view);
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
                    adder.handleAddShape(addOption, shapes);
                    break;
                case 2:
                    view.printMessage(shapes.getShapesTable());
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
                    shapeFormulas.handleFormulas(formulaOption);
                    reader.promptEnterKey();
                    break;
                case 0:
                    isRunning = false;
                    break;

            }
        }
    }
}
