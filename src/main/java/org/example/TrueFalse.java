package org.example;

import java.util.Scanner;

public class TrueFalse extends Question {

    public TrueFalse(String theQuestion, String theAnswer) {
        super(theQuestion, theAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        if (answer.toUpperCase().equals(this.getTheAnswer())) {
            return true;
        } else {
            return false;
        }
    }
}