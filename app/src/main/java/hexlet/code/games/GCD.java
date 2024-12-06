package hexlet.code.games;

import hexlet.code.Utils;

public class GCD {

    public static String conditionOfTheGame() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String[][] logic() {

        String[][] findings = new String[3][3];
        for (int i = 0; i < 3; i++) {
            findings[i][0] = "" + Utils.randomNumber(30);
            findings[i][1] = "" + Utils.randomNumber(30);
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
        String[][] convFindings = new String[3][2];
        for (int i = 0; i < 3; i++) {
            convFindings[i][1] = findings[i][2];
            convFindings[i][0] = findings [i][0] + " " + findings[i][1];
        }
        return convFindings;
    }
}

