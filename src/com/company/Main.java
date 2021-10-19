package com.company;

import com.company.question.Question;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Question q1 = new Question("Test question");

        q1.addAnswer("Wrong answer #1");
        q1.addAnswer("Wrong answer #2");
        q1.addAnswer("Wrong answer #3");
        q1.setCorrectAnswer("Correct Answer");

        q1.ask();
        System.out.println("(type the answer you think is correct)\n> ");

        String answer = scanner.nextLine();

        boolean answeredCorrectly = q1.answer(answer);
    }
}
