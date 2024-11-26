package hexlet.code;

import hexlet.code.games.Prime;
import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Progression;
import hexlet.code.games.Calc;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static String userName;
    private static String yourAnswer;
    private static String trueAnswer;
    private static int randomNum1;
    private static int randomNum2;
    private static int randomNum3;
    private static String task;

    public static void setUserName(String userName) {
        Engine.userName = userName;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setYourAnswer(String yourAnswer) {
        Engine.yourAnswer = yourAnswer;
    }

    public static String getYourAnswer() {
        return yourAnswer;
    }

    public static void setTrueAnswer(String trueAnswer) {
        Engine.trueAnswer = trueAnswer;
    }

    public static String getTrueAnswer() {
        return trueAnswer;
    }

    public static void setRandomNum1(int randomNum1) {
        Engine.randomNum1 = randomNum1;
    }

    public static int getRandomNum1() {
        return randomNum1;
    }

    public static void setRandomNum2(int randomNum2) {
        Engine.randomNum2 = randomNum2;
    }

    public static int getRandomNum2() {
        return randomNum2;
    }

    public static void setRandomNum3(int randomNum3) {
        Engine.randomNum3 = randomNum3;
    }

    public static int getRandomNum3() {
        return randomNum3;
    }

    public static void setTask(String task) {
        Engine.task = task;
    }

    public static String getTask() {
        return task;
    }

    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(1, 30);
    }

    public static void logic() {
        Scanner scanner = new Scanner(System.in);
        varConditionOfTheGame();

        for (int i = 1; true; ++i) {
            randomNum1 = randomNumber();
            randomNum2 = randomNumber();
            randomNum3 = Calc.randomNumber();
            varPointOfTheGame();
            System.out.println("Question: " + task);
            yourAnswer = scanner.nextLine();
            System.out.println("Your answer: " + yourAnswer);

            if (yourAnswer.equals(trueAnswer)) {
                System.out.println("Correct!");
            }
            if (!yourAnswer.equals(trueAnswer)) {
                System.out.println("'" + yourAnswer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'" + trueAnswer + "'.");
                System.out.println("Let's try again, " + Engine.userName + "!");
                break;
            }
            if (i == 3) {
                System.out.println("Congratulations, " + Engine.userName + "!");
                break;
            }
        }
    }

    public static void varPointOfTheGame() {
        switch (App.getGameNumber()) {
            case 2:
                Even.pointOfTheGame();
                break;
            case 3:
                Calc.pointOfTheGame();
                break;
            case 4:
                GCD.pointOfTheGame();
                break;
            case 5:
                Progression.pointOfTheGame();
                break;
            case 6:
                Prime.pointOfTheGame();
                break;
        }
    }
    public static void varConditionOfTheGame() {
        switch (App.getGameNumber()) {
            case 2:
                Even.conditionOfTheGame();
                break;
            case 3:
                Calc.conditionOfTheGame();
                break;
            case 4:
                GCD.conditionOfTheGame();
                break;
            case 5:
                Progression.conditionOfTheGame();
                break;
            case 6:
                Prime.conditionOfTheGame();
                break;
            }
        }

}




