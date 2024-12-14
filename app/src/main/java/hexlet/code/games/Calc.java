package hexlet.code.games;

import hexlet.code.Utils;

public class Calc {

    private static final int ATTEMPTS = 3;
    private static final int SIZE_OF_ARRAY = 4;
    private static final int UPPER_BOUND = 12;
    private static final int PLUS = 1;
    private static final int MINUS = 2;
    private static final int MULTIPLY = 3;
    private static final int FIRST_NUM = 1;
    private static final int SECOND_NUM = 2;
    private static final int ANSWER = 3;
    private static final int NUM_OF_OPTIONS = 4;
    private static final int MATH_SIGN = 0;

    public static String conditionOfTheGame() {
        return "What is the result of the expression?";
    }


    public static String[][] logic() {

        String[][] findings = new String[ATTEMPTS][SIZE_OF_ARRAY];
        for (int i = 0; i < ATTEMPTS; i++) {

            int num = Utils.randomNumber(NUM_OF_OPTIONS);
            if (num == PLUS) {
                findings[i][MATH_SIGN] = "+";
            }
            if (num == MINUS) {
                findings[i][MATH_SIGN] = "-";
            }
            if (num == MULTIPLY) {
                findings[i][MATH_SIGN] = "*";
            }
            findings[i][FIRST_NUM] = "" + Utils.randomNumber(UPPER_BOUND);
            findings[i][SECOND_NUM] = "" + Utils.randomNumber(UPPER_BOUND);
            findings[i][ANSWER] = comparison(findings[i][MATH_SIGN], findings[i][FIRST_NUM], findings[i][SECOND_NUM]);
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
        return Integer.toString(intFirstQuestion * intSecondQuestion);
    }

    public static String[][] conversion(String[][] findings) {
        String[][] convFindings = new String[ATTEMPTS][2];
        for (int i = 0; i < ATTEMPTS; i++) {
            convFindings[i][1] = findings[i][ANSWER];
            convFindings[i][0] = findings[i][FIRST_NUM] + " " + findings[i][MATH_SIGN] + " " + findings[i][SECOND_NUM];
        }
        return convFindings;
    }
}
