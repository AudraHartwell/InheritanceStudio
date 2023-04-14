package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<>();
    private int numberOfQuestionsCorrect = 0;

    private Scanner scanner = new Scanner(System.in);

    public Quiz() {

    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        for (Question question : questions) {
            System.out.println(question.getTheQuestion());
            String usersAnswer = this.getUsersAnswers();
            question.checkAnswer(usersAnswer);
            boolean userGotAnswerCorrect = question.checkAnswer(usersAnswer);
            if (userGotAnswerCorrect) {
                this.numberOfQuestionsCorrect ++;
            }
        }

        double percentageCorrect = (this.numberOfQuestionsCorrect / this.questions.size()) * 100;
        System.out.println("User's Grade: " + percentageCorrect + "%");
    }

    private String getUsersAnswers() {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }
}

