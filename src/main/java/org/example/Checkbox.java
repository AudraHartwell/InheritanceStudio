package org.example;

import java.util.Scanner;

public class Checkbox extends Question {
    private boolean answer;

    public Checkbox(String question, int points, boolean answer) {
        super(question, points);
        this.answer = answer;
    }

    public boolean compareAnswers(boolean userAnswer) {
        if (userAnswer = correctAnswer) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("True or False: ");
        String userAnswer = answer.nextLine();
        if (userAnswer.indexOf('t') >= 0) {
            if (compareAnswers(true)) {
                return 1;
            } else {
                return 0;
            }
        }
        else {
            if (compareAnswers(false)) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public void displayAnswers() {
        System.out.println("True or False");
    }
}