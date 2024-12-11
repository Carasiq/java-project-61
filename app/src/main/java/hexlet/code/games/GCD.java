package hexlet.code.games;

import hexlet.code.Utils;

public class GCD {

    public static String conditionOfTheGame() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String[][] logic() {

        String[][] findings = new String[3][3];
        final int attempts = 3;
        final int upperBound = 30;
        for (int i = 0; i < attempts; i++) {
            findings[i][0] = "" + Utils.randomNumber(upperBound);
            findings[i][1] = "" + Utils.randomNumber(upperBound);
            findings[i][2] = comparison(findings[i][0], findings[i][1]);
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
        final int attempts = 3;
        String[][] convFindings = new String[attempts][2];
        for (int i = 0; i < attempts; i++) {
            convFindings[i][1] = findings[i][2];
            convFindings[i][0] = findings[i][0] + " " + findings[i][1];
        }
        return convFindings;
    }
}

