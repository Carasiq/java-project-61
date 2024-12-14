package hexlet.code.games;

import hexlet.code.Utils;

public class Even {
    private static final int attempts = 3;
    private static final int upperBound = 30;
    private static final int question = 0;
    private static final int answer = 1;
    private static final int sizeOfArray = 2;

    public static String conditionOfTheGame() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String[][] logic() {
        String[][] findings = new String[attempts][sizeOfArray];
        for (int i = 0; i < attempts; i++) {
            findings[i][question] = "" + Utils.randomNumber(upperBound);
            findings[i][answer] = comparison(findings[i][question]);
        }
        return findings;
    }

    public static String comparison(String question) {
        if (Integer.parseInt(question) % 2 != 0) {
            return "no";
        }
        return "yes";
    }
}

