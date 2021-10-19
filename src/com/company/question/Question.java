package com.company.question;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Question implements  IQuestion {
    private String questionText;
    private ArrayList<String> answers;
    private String correctAnswer;

    public Question(String questionText) {
        answers = new ArrayList<>();
        this.questionText = questionText;
    }

    @Override
    public void ask() {
        System.out.println("=====================");
        System.out.println(questionText);
        System.out.println("=====================");

        Collections.shuffle(answers);

        for(int i = 0; i < answers.size(); i += 2) {
            System.out.print((i+1) + ". " + answers.get(i));

            StringBuilder spaceBuilder = new StringBuilder();
            for(int j = 0; j < 40 - answers.get(i).length(); j++) {
                spaceBuilder.append(" ");
            }

            System.out.print(spaceBuilder.toString());

            System.out.print((i+2) + ". " + answers.get(i+1));
            System.out.println(" ");
        }
    }

    @Override
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    @Override
    public String getQuestionText() {
        return this.questionText;
    }

    @Override
    public void addAnswer(String answer) {
        answers.add(answer);
    }

    @Override
    public void setCorrectAnswer(String correctAnswer) {
        answers.add(correctAnswer);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean answer(String answer) {
        if(answer.equalsIgnoreCase(correctAnswer)) {
            onCorrectAnswer();
            return true;
        }
        onIncorrectAnswer();
        return false;
    }

    protected void onCorrectAnswer() {
        System.out.println("Correct!");
    }

    protected  void onIncorrectAnswer() {
        System.out.println("Incorrect");
    }
}
