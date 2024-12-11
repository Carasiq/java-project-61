package hexlet.code.games;

import hexlet.code.Utils;

public class Even {

    public static String conditionOfTheGame() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String[][] logic() {
        final int attempts = 3;
        final int upperBound = 30;
        String[][] findings = new String[attempts][2];
        for (int i = 0; i < attempts; i++) {
            findings[i][0] = "" + Utils.randomNumber(upperBound);
            findings[i][1] = comparison(findings[i][0]);
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

