package hexlet.code.games;

import hexlet.code.Utils;

public class Calc {

    private static final int attempts = 3;
    private static final int sizeOfArray = 4;
    private static final int upperBound = 12;
    private static final int plus = 1;
    private static final int minus = 2;
    private static final int multiply = 3;
    private static final int firstNumber = 1;
    private static final int secondNumber = 2;
    private static final int answer = 3;
    private static final int numberOfOptions = 4;
    private static final int mathSign = 0;

    public static String conditionOfTheGame() {
        return "What is the result of the expression?";
    }


    public static String[][] logic() {

        String[][] findings = new String[attempts][sizeOfArray];
        for (int i = 0; i < attempts; i++) {

            int num = Utils.randomNumber(numberOfOptions);
            if (num == plus) {
                findings[i][mathSign] = "+";
            }
            if (num == minus) {
                findings[i][mathSign] = "-";
            }
            if (num == multiply) {
                findings[i][mathSign] = "*";
            }
            findings[i][firstNumber] = "" + Utils.randomNumber(upperBound);
            findings[i][secondNumber] = "" + Utils.randomNumber(upperBound);
            findings[i][answer] = comparison(findings[i][mathSign], findings[i][firstNumber], findings[i][secondNumber]);
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
        String[][] convFindings = new String[attempts][2];
        for (int i = 0; i < attempts; i++) {
            convFindings[i][1] = findings[i][answer];
            convFindings[i][0] = findings [i][firstNumber] + " " + findings[i][mathSign] + " " + findings[i][secondNumber];
        }
        return convFindings;
    }
}
