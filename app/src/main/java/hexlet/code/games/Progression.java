package hexlet.code.games;

import hexlet.code.Utils;

public class Progression {
    private static final int attempts = 3;
    private static final int quantity = 10;
    private static final int upperBoundOfInitNum = 10;
    private static final int upperBoundOfRandomPosNum = 10;
    private static final int upperBoundOfStepNum = 8;
    private static final int sizeOfArray = 11;

    public static String conditionOfTheGame() {
        return "What number is missing in the progression?";
    }
    public static String[][] logic() {
        String[][] findings = new String[attempts][sizeOfArray];

        for (int i = 0; i < attempts; i++) {
            int initNum = Utils.randomNumber(upperBoundOfInitNum);
            int randomPosNum = Utils.randomNumber(upperBoundOfRandomPosNum);
            int stepNum = Utils.randomNumber(upperBoundOfStepNum);
            findings[i][0] = "";
            for (int j = 0; j < quantity; j++) {
                findings[i][j] = "" + initNum * stepNum;
                if (j == randomPosNum) {
                    findings[i][quantity] = "" + initNum * stepNum;
                    findings[i][j] = "..";
                }
                ++stepNum;
            }
        } return conversion(findings);
    }

    public static String[][] conversion(String[][] findings) {

        String[][] convFindings = new String[attempts][2];
        for (int i = 0; i < attempts; i++) {
            convFindings[i][1] = findings[i][quantity];
            convFindings[i][0] = "";
            for (int k = 0; k < quantity; k++) {
                convFindings[i][0] = convFindings[i][0] + " " + findings[i][k];
                if (k == 0) {
                    convFindings[i][0] = convFindings[i][0].trim();
                }
            }
        }
        return convFindings;
    }
}
