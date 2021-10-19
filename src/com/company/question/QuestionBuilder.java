package com.company.question;

import java.util.Random;

public class QuestionBuilder {
    private Question question;

    public QuestionBuilder setQuestion(String questionText) {
        question.setQuestionText(questionText);

        return this;
    }

    public QuestionBuilder addAnswer(String answer) {
        question.addAnswer(answer);

        return this;
    }

    public QuestionBuilder addCorrectAnswer(String answer) {
        return this;
    }

    public Question get() {
        return question;
    }

    /*void generateQuestion(String path){
        Random random = new Random();

        String generatedQuestion = random;

    }*/
}
