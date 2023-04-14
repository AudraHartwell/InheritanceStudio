package org.example;

import java.util.Scanner;

public abstract class Question {
    private String question;

    private int points;

    public Question(String question, int points) {
        this.question = question;
        this.points = points;
    }

    public void printQuestion() {
      System.out.println(question);
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public abstract int getAnswers();

    public abstract void displayAnswers();

}
