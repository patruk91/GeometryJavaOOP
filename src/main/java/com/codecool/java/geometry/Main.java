package com.codecool.java.geometry;

import com.codecool.java.geometry.containers.ShapeList;
import com.codecool.java.ui.Reader;
import com.codecool.java.ui.View;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        Reader reader = new Reader();
	    ShapeList shapes = new ShapeList();
	    boolean isRunning = true;


	    while (isRunning) {
            view.printMenu();
            int option = reader.getIntFromUser("Option", 0, 5);

            switch (option) {
                case 1:
                    // Add new shape
                    break;
                case 2:
                    // Show all shapes
                    break;
                case 3:
                    // Show shape with the largest perimeter
                    break;
                case 4:
                    // Show shape with the largest area
                    break;
                case 5:
                    // Show formulas
                    break;
                case 0:
                    isRunning = false;
                    break;

            }
        }
    }
}
