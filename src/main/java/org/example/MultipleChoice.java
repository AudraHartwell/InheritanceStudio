package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MultipleChoice extends Question {

    public MultipleChoice(String theQuestion, String theAnswer) {
        super(theQuestion, theAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {

        String actualAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }

    }
}

