package com.codecool.java.ui;

import java.util.Scanner;

public class Reader {
    Scanner reader;

    public Reader() {
        this.reader = new Scanner(System.in);
    }

    public String readString() {
        return this.reader.nextLine();
    }
    
}
