package com.company.question;

import java.util.ArrayList;

public interface IQuestion {
    void setQuestionText(String questionText);
    String getQuestionText();

    void addAnswer(String answer);
    void setCorrectAnswer(String correctAnswer);

    void ask();
    boolean answer(String answer);

}
