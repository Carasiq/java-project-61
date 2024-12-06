package hexlet.code.games;

import hexlet.code.Utils;

public class Prime {

    public static String conditionOfTheGame() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String[][] logic() {
        String[][] findings = new String[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                findings[i][0] = "" + Utils.randomNumber(30);
                findings[i][1] = comparison(findings[i][0]);
            }
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