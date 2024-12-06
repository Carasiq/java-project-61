package hexlet.code.games;

import hexlet.code.Utils;

public class Calc {

    public static String conditionOfTheGame() {
        return "What is the result of the expression?";
    }


    public static String[][] logic() {

        String[][] findings = new String[3][4];
        for (int i = 0; i < 3; i++) {

            int num = Utils.randomNumber(4);
            if (num == 1) {
                findings[i][0] = "+";
            }
            if (num == 2) {
                findings[i][0] = "-";
            }
            if (num == 3) {
                findings[i][0] = "*";
            }
            findings[i][1] = "" + Utils.randomNumber(12);
            findings[i][2] = "" + Utils.randomNumber(12);
            findings[i][3] = comparison(findings[i][0], findings[i][1], findings[i][2]);
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
        String[][] convFindings = new String[3][2];
        for (int i = 0; i < 3; i++) {
            convFindings[i][1] = findings[i][3];
            convFindings[i][0] = findings [i][1] + " " + findings[i][0] + " " + findings[i][2];
        }
        return convFindings;
    }
}
