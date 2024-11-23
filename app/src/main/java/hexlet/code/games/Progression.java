package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void pointOfTheGame() {
        int j = randomNumber();
        int k = randomNumber();
        Engine.task = "";
        int result = 0;

        for (int i = 0; i <= 10; ++i) {
            result = result + Engine.randomNum1 + j;
            Engine.task = Engine.task + " " + result;

            if (i == k) {
                result = result + Engine.randomNum1 + j;
                Engine.trueAnswer = "" + result;
                Engine.task = Engine.task + " ..";
            }

        }
    }

    public static void conditionOfTheGame() {
        System.out.println("What number is missing in the progression?");
    }

    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(1, 10);
    }
}
