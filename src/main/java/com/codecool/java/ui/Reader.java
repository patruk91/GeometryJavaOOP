package com.codecool.java.ui;

import java.util.Scanner;

public class Reader {
    Scanner reader;
    View view;
    Validator validator;

    public Reader() {
        this.reader = new Scanner(System.in);
        this.validator = new Validator();
        this.view = new View();
    }

    public String readString() {
        return this.reader.nextLine();
    }

    public Integer getIntFromUser(String question, int start, int end){
        String userInput;
        int userInteger = -1;
        boolean answerIsCorrect = false;

        while (!(answerIsCorrect)){
            this.view.printQuestion(question);
            userInput = this.readString();

            if (this.validator.validateString(userInput) && this.validator.isNumeric(userInput)){
                userInteger = Integer.parseInt(userInput);
                if (this.validator.isNumberInRange(start, end, userInteger)){
                    answerIsCorrect = true;
                } else {
                    this.view.printError("Integer needs to be in range of " + start + " and " + end);
                }
            } else {
                this.view.printError("Input needs to be integer");
            }
        }
        return userInteger;
    }
}
