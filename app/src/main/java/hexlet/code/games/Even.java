package hexlet.code.games;

import hexlet.code.Utils;

public class Even {

    public static String conditionOfTheGame() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String[][] logic() {
        String[][] findings = new String[3][2];
        for (int i = 0; i < 3; i++) {
            findings[i][0] = "" + Utils.randomNumber(30);
            findings[i][1] = comparison(findings[i][0]);
        }
        return findings;
    }

    public static String comparison(String question) {
        if (Integer.parseInt(question) % 2 != 0) {
            return "no";
        }
        else return "yes";
    }
}

