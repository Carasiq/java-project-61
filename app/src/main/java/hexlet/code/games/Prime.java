package hexlet.code.games;

import hexlet.code.Utils;

public class Prime {
    private static final int ATTEMPTS = 3;
    private static final int UPPER_BOUND = 30;
    private static final int QUESTION = 0;
    private static final int ANSWER = 1;
    private static final int SIZE_OF_ARRAY = 2;

    public static String conditionOfTheGame() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String[][] logic() {
        String[][] findings = new String[ATTEMPTS][SIZE_OF_ARRAY];
        for (int i = 0; i < ATTEMPTS; i++) {
            findings[i][QUESTION] = "" + Utils.randomNumber(UPPER_BOUND);
            findings[i][ANSWER] = comparison(findings[i][QUESTION]);

        } return findings;
    }

    public static String comparison(String question) {
        int intQuestion = Integer.parseInt(question);

        if (intQuestion < 2) {
            return "no";
        }

        for (int i = 2; i <= intQuestion / 2; i++) {
            if (intQuestion % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}