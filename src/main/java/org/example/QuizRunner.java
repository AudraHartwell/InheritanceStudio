package org.example;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoice  myMultipleChoice = new MultipleChoice("What does Karhu translate to in English? Please just type a single letter as an answer\nA: Wolf\nB: Bear\nC: Frog\nD:Iguana ", "B");
        myQuiz.addQuestion(myMultipleChoice);

        Checkbox myCheckbox = new Checkbox("Select all the apply, which of these shoes are in the high cushion category?\nA: Brooks Ghost\nB: Hoka Bondi\nC:New Balance 1080\nD: Altra Escalante", "B,C");
        myQuiz.addQuestion(myCheckbox);

        TrueFalse myTrueFalse = new TrueFalse("Audra is allergic to grass.", "True");
        myQuiz.addQuestion(myTrueFalse);

        myQuiz.runQuiz();
    }
}
