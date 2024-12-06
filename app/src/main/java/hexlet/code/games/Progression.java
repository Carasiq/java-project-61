package hexlet.code.games;

import hexlet.code.Utils;

public class Progression {

    public static String conditionOfTheGame() {
        return "What number is missing in the progression?";
    }

    public static String[][] logic() {

        String[][] findings = new String[3][11];
        for (int i = 0; i < 3; i++) {
            int initNum = Utils.randomNumber(10);
            int randomPosNum = Utils.randomNumber(10);
            int stepNum = Utils.randomNumber(8);
            findings[i][0] = "";
            for (int j = 0; j < 10; j++) {
                findings[i][j] = "" + initNum * stepNum;
                if (j == randomPosNum) {
                    findings[i][10] = "" + initNum * stepNum;
                    findings[i][j] = "..";
                }
                ++stepNum;
            }
        } return conversion(findings);
    }

    public static String[][] conversion(String[][] findings) {
        String[][] convFindings = new String[3][2];
        for (int i = 0; i < 3; i++) {
            convFindings[i][1] = findings[i][10];
            convFindings[i][0] = "";
            for (int k = 0; k < 10; k++) {
                convFindings[i][0] = convFindings[i][0] + " " + findings[i][k];
                if (k == 0) {
                    convFindings[i][0] = convFindings[i][0].trim();
                }
            }
        }
        return convFindings;
    }
}