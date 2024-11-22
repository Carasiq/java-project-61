package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void pointOfTheGame() {
        Engine.task = Engine.randomNum1 + " " + Engine.randomNum2;

        while (Engine.randomNum2 != 0) {
            int tmp = Engine.randomNum1 % Engine.randomNum2;
            Engine.randomNum1 = Engine.randomNum2;
            Engine.randomNum2 = tmp;
        }
        Engine.trueAnswer = "" + Engine.randomNum1;
    }

    public static void conditionOfTheGame() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }
}

