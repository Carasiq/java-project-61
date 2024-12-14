package hexlet.code.games;

import hexlet.code.Utils;

public class Progression {
    private static final int ATTEMPTS = 3;
    private static final int QUANTITY = 10;
    private static final int UPPER_BOUND_OF_INIT_NUM = 10;
    private static final int UPPER_BOUND_OF_RANDOM_NUM = 10;
    private static final int UPPER_BOUND_OF_STEP_NUM = 8;
    private static final int SIZE_OF_ARRAY = 11;

    public static String conditionOfTheGame() {
        return "What number is missing in the progression?";
    }
    public static String[][] logic() {
        String[][] findings = new String[ATTEMPTS][SIZE_OF_ARRAY];

        for (int i = 0; i < ATTEMPTS; i++) {
            int initNum = Utils.randomNumber(UPPER_BOUND_OF_INIT_NUM); // Начальное число
            int randomPosNum = Utils.randomNumber(UPPER_BOUND_OF_RANDOM_NUM); // Случайное место появления
            int stepNum = Utils.randomNumber(UPPER_BOUND_OF_STEP_NUM); // Шаг прогрессии
            findings[i][0] = "";
            for (int j = 0; j < QUANTITY; j++) {
                findings[i][j] = "" + initNum * stepNum;
                if (j == randomPosNum) {
                    findings[i][QUANTITY] = "" + initNum * stepNum;
                    findings[i][j] = "..";
                }
                ++stepNum;
            }
        } return conversion(findings);
    }

    public static String[][] conversion(String[][] findings) {

        String[][] convFindings = new String[ATTEMPTS][2];
        for (int i = 0; i < ATTEMPTS; i++) {
            convFindings[i][1] = findings[i][QUANTITY];
            convFindings[i][0] = "";
            for (int k = 0; k < QUANTITY; k++) {
                convFindings[i][0] = convFindings[i][0] + " " + findings[i][k];
                if (k == 0) {
                    convFindings[i][0] = convFindings[i][0].trim();
                }
            }
        }
        return convFindings;
    }
}
