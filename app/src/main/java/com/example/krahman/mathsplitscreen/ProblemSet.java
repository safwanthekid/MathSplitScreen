package com.example.krahman.mathsplitscreen;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

public class ProblemSet{

    private ArrayList<String> truefalseproblems;
    private Hashtable<String, Integer> truefalseproblemanswers;

    public ProblemSet() {
        truefalseproblems = new ArrayList<String>();
        truefalseproblemanswers = new Hashtable<String, Integer>();
        truefalseproblemanswers.put("60 degrees is acute",0);
        truefalseproblemanswers.put("80 degrees is acute",0);
        truefalseproblemanswers.put("135 degrees is obtuse",0);
        truefalseproblemanswers.put("180 degrees is straight",0);
        truefalseproblemanswers.put("90 degrees is obtuse",1);
        String s1 = "60 degrees is acute";
        String s2 = "80 degrees is acute";
        String s3 = "135 degrees is obtuse";
        String s4 = "180 degrees is straight";
        String s5 = "90 degrees is obtuse";
        truefalseproblems.add(s1);
        truefalseproblems.add(s2);
        truefalseproblems.add(s3);
        truefalseproblems.add(s4);
        truefalseproblems.add(s5);
    }

    public String[] generateMultProblem() {
        Random rand = new Random();
        String[] answers = new String[6];

        int a = rand.nextInt(100)+1;
        int b = rand.nextInt(100)+1;
        answers[0] = a + " + " + b;

        int ans = a + b;
        int ansnum = rand.nextInt(4);
        answers[5] = "" + ansnum;

        int c = rand.nextInt(200)+1,d = rand.nextInt(200)+1,e = rand.nextInt(200)+1,f = rand.nextInt(200)+1;

        if (ansnum != 0) {
            while(c == ans)
                c = rand.nextInt(200)+1;
            answers[1] = "" + c;
        } else {
            answers[1] = "" + ans;
        }

        if (ansnum != 1) {
            while(d == ans || d == c)
                d = rand.nextInt(200)+1;
            answers[2] = "" + d;
        } else {
            answers[2] = "" + ans;
        }

        if (ansnum != 2) {
            while(e == ans || e == c || e == d)
                e = rand.nextInt(200)+1;
            answers[3] = "" + c;
        } else {
            answers[3] = "" + ans;
        }

        if (ansnum != 3) {
            while(f == ans || f == c || f == d || f == e)
                f = rand.nextInt(200)+1;
            answers[4] = "" + f;
        } else {
            answers[4] = "" + ans;
        }
        return answers;

    }

    public String generateTrueFalseProblem() {
        Random rand = new Random();
        int a = rand.nextInt(truefalseproblems.size());
        return truefalseproblems.get(a);
    }
    public int generateTrueFalseAnswer(String currentProblem) {
        return truefalseproblemanswers.get(currentProblem);
    }

}
