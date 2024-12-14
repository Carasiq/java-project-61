package hexlet.code.games;

import hexlet.code.Utils;

public class Calc {

    public static String conditionOfTheGame() {
        return "What is the result of the expression?";
    }


    public static String[][] logic() {
        final int attempts = 3;
        final int sizeOfArray = 4;
        final int upperBound = 12;

        final int plus = 1;
        final int minus = 2;
        final int multiply = 3;
        final int firstCount = 1;
        final int secondCount = 2;
        final int answer = 3;
        final int numberOfOptions = 4;
        String[][] findings = new String[attempts][sizeOfArray];
        for (int i = 0; i < attempts; i++) {

            int num = Utils.randomNumber(numberOfOptions);
            if (num == plus) {
                findings[i][0] = "+";
            }
            if (num == minus) {
                findings[i][0] = "-";
            }
            if (num == multiply) {
                findings[i][0] = "*";
            }
            findings[i][firstCount] = "" + Utils.randomNumber(upperBound);
            findings[i][secondCount] = "" + Utils.randomNumber(upperBound);
            findings[i][answer] = comparison(findings[i][0], findings[i][firstCount], findings[i][secondCount]);
        }
        return conversion(findings);
    }

    public static String comparison(String mathSign, String firstQuestion, String secondQuestion) {
        int intFirstQuestion = Integer.parseInt(firstQuestion);
        int intSecondQuestion = Integer.parseInt(secondQuestion);

        if (mathSign.equals("+")) {
            return Integer.toString(intFirstQuestion + intSecondQuestion);
        }
        if (mathSign.equals("-")) {
            return Integer.toString(intFirstQuestion - intSecondQuestion);
        }
        else return Integer.toString(intFirstQuestion * intSecondQuestion);
    }

    public static String[][] conversion(String[][] findings) {
        final int attempts = 3;
        final int answer = 3;

        String[][] convFindings = new String[attempts][2];
        for (int i = 0; i < attempts; i++) {
            convFindings[i][1] = findings[i][answer];
            convFindings[i][0] = findings [i][1] + " " + findings[i][0] + " " + findings[i][2];
        }
        return convFindings;
    }
}
