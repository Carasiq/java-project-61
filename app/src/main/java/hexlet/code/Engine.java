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
    private static String trueAnswer;
    private static int randomNum1;
    private static int randomNum2;
    private static int randomNum3;
    private static String task;


    public static void setUserName(String pUserName) {
        Engine.userName = pUserName;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setTrueAnswer(String trueAnswer) {
        Engine.trueAnswer = trueAnswer;
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
        final int upperBound = 10;
        Random random = new Random();
        return random.nextInt(1, upperBound);
    }

    public static void logic() {
        String yourAnswer;
        Scanner scanner = new Scanner(System.in);
        varConditionOfTheGame();

        for (int i = 1; true; ++i) {
            final int numOfAttempts = 3;
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
            if (i == numOfAttempts) {
                System.out.println("Congratulations, " + Engine.userName + "!");
                break;
            }
        }
    }

    public static void varPointOfTheGame() {
       final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;

        switch (App.getGameNumber()) {
            case even:
                Even.pointOfTheGame();
                break;
            case calc:
                Calc.pointOfTheGame();
                break;
            case gcd:
                GCD.pointOfTheGame();
                break;
            case progression:
                Progression.pointOfTheGame();
                break;
            case prime:
                Prime.pointOfTheGame();
                break;
            default:
        }
    }
    public static void varConditionOfTheGame() {
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;

        switch (App.getGameNumber()) {
            case even:
                Even.conditionOfTheGame();
                break;
            case calc:
                Calc.conditionOfTheGame();
                break;
            case gcd:
                GCD.conditionOfTheGame();
                break;
            case progression:
                Progression.conditionOfTheGame();
                break;
            case prime:
                Prime.conditionOfTheGame();
                break;
            default:
            }
        }

}




