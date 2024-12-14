package hexlet.code.games;

import hexlet.code.Utils;

public class GCD {
    private static final int ATTEMPTS = 3;
    private static final int SIZE_OF_ARRAY = 3;
    private static final int UPPER_BOUND = 30;
    private static final int FIRST_NUM = 0;
    private static final int SECOND_NUM = 1;
    private static final int ANSWER = 2;


    public static String conditionOfTheGame() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String[][] logic() {

        String[][] findings = new String[ATTEMPTS][SIZE_OF_ARRAY];
        for (int i = 0; i < ATTEMPTS; i++) {
            findings[i][FIRST_NUM] = "" + Utils.randomNumber(UPPER_BOUND);
            findings[i][SECOND_NUM] = "" + Utils.randomNumber(UPPER_BOUND);
            findings[i][ANSWER] = comparison(findings[i][FIRST_NUM], findings[i][SECOND_NUM]);
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
        String[][] convFindings = new String[ATTEMPTS][2];
        for (int i = 0; i < ATTEMPTS; i++) {
            convFindings[i][1] = findings[i][ANSWER];
            convFindings[i][0] = findings[i][FIRST_NUM] + " " + findings[i][SECOND_NUM];
        }
        return convFindings;
    }
}

