package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Question {
    private final String theQuestion;
    private final String theAnswer;

    public Question(String theQuestion, String theAnswer) {
        this.theQuestion = theQuestion;
        this.theAnswer = theAnswer;
    }

    public abstract boolean checkAnswer(String answer);

    public String getTheQuestion() {
        return theQuestion;
    }

    public String getTheAnswer() {
        return theAnswer;
    }

}
