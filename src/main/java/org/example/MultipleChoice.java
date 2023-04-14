package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MultipleChoice extends Question{
    private ArrayList<String> answer;
    private ArrayList<String> correctAnswer;

    public MultipleChoice(String question, int points) {
        super(question, points);
    }

    public ArrayList<String> getAnswer() {
        return answer;
    }
}
