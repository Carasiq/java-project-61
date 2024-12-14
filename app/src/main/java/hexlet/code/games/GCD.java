package hexlet.code.games;

import hexlet.code.Utils;

public class GCD {
    private static final int attempts = 3;
    private static final int sizeOfArray = 3;
    private static final int upperBound = 30;
    private static final int firstNumber = 0;
    private static final int secondNumber = 1;
    private static final int answer = 2;


    public static String conditionOfTheGame() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String[][] logic() {

        String[][] findings = new String[attempts][sizeOfArray];
        for (int i = 0; i < attempts; i++) {
            findings[i][firstNumber] = "" + Utils.randomNumber(upperBound);
            findings[i][secondNumber] = "" + Utils.randomNumber(upperBound);
            findings[i][answer] = comparison(findings[i][firstNumber], findings[i][secondNumber]);
        }
        return conversion(findings);
    }

    public static String comparison(String firstQuestion, String secondQuestion) {
        int intFirstQuestion = Integer.parseInt(firstQuestion);
        int intSecondQuestion = Integer.parseInt(secondQuestion);

        while (intSecondQuestion != 0) {
            int tmp = intFirstQuestion % intSecondQuestion;
            intFirstQuestion = intSecondQuestion;
            intSecondQuestion = tmp;
        }
        return Integer.toString(intFirstQuestion);
    }

    public static String[][] conversion(String[][] findings) {
        String[][] convFindings = new String[attempts][2];
        for (int i = 0; i < attempts; i++) {
            convFindings[i][1] = findings[i][answer];
            convFindings[i][0] = findings[i][firstNumber] + " " + findings[i][secondNumber];
        }
        return convFindings;
    }
}

