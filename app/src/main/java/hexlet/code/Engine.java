package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static String userName;
    public static String yourAnswer;
    public static String trueAnswer;
    public static int randomNum1;
    public static int randomNum2;
    public static int randomNum3;
    public static String task;

    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(1,30);
    }

    public static void parityCheck() {
        Scanner scanner = new Scanner(System.in);
        varConditionOfTheGame(App.gameNumber);

        for (int i = 1; true; ++i) {
            randomNum1 = randomNumber();
            randomNum2 = randomNumber();
            randomNum3 = Calc.randomNumber();
            varPointOfTheGame(App.gameNumber);
            System.out.println("Question: " + task);
            yourAnswer = scanner.nextLine();
            System.out.println("Your answer: " + yourAnswer);


            if (i == 3) {
                System.out.println("Congratulations, " + Engine.userName + " !");
                break;
            }

            if (yourAnswer.equals(trueAnswer)) {
                System.out.println("Correct!");
            }
            if (!yourAnswer.equals(trueAnswer)) {
                System.out.println("'" + yourAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + trueAnswer + "'.");
                System.out.println("Let's try again, " + Engine.userName + " !");
                break;
            }
        }
    }
    public static void varPointOfTheGame(int k) {
        if (k == 2) {
            Even.pointOfTheGame();
        }
        if (k == 3) {
            Calc.pointOfTheGame();
        }
    }
    public static void varConditionOfTheGame(int k) {
        if (k == 2) {
            Even.conditionOfTheGame();
        }
        if (k == 3) {
            Calc.conditionOfTheGame();
        }
    }
}




