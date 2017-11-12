package com.example.krahman.mathsplitscreen;

import java.util.Random;

public class Player{

    private ProblemSet problemSet = new ProblemSet();
    private String currentProblem;
    private String currentAnswer1;
    private String currentAnswer2;
    private String currentAnswer3;
    private String currentAnswer4;
    private int correctAnswer;
    private int pressedButton;
    private int score;


    public Player() {
    }

    public void setUpProblem() {
        Random rand = new Random();
        String[] randomProbType = {"mult", "mult", "mult", "truefalse"};
        int n = rand.nextInt(randomProbType.length);
        if(randomProbType[n].equals("mult")) {
            String[] problem = problemSet.generateMultProblem();
            currentProblem = problem[0];
            currentAnswer1 = problem[1];
            currentAnswer2 = problem[2];
            currentAnswer3 = problem[3];
            currentAnswer4 = problem[4];
            correctAnswer = Integer.parseInt(problem[5]);
        }else if(randomProbType[n].equals("truefalse")) {
            currentProblem = problemSet.generateTrueFalseProblem();
            currentAnswer1 = "true";
            currentAnswer2 = "false";
            currentAnswer3 = "blank";
            currentAnswer4 = "blank";
            correctAnswer = problemSet.generateTrueFalseAnswer(currentProblem);
        }

    }

    public String getCurrentProblem() {
        return currentProblem;
    }

    public String getCurrentAnswer1() {
        return currentAnswer1;
    }

    public String getCurrentAnswer2() {
        return currentAnswer2;
    }

    public String getCurrentAnswer3() {
        return currentAnswer3;
    }

    public String getCurrentAnswer4() {
        return currentAnswer4;
    }

    public void resetScore() {
        score = 0;
    }

    public int getScore() {
        return score;
    }



    public boolean resolve(int pressed) {
        if (correctAnswer == pressed) {
            score++;
            return true;
        } else
            return false;
    }


}
