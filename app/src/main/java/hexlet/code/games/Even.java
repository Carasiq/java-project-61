package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void pointOfTheGame() {
        if (Engine.randomNum1 % 2 != 0) {
            Engine.trueAnswer = "no";
        }
        if (Engine.randomNum1 % 2 == 0) {
            Engine.trueAnswer = "yes";
        }
        Engine.task = Integer.toString(Engine.randomNum1);
    }

    public static void conditionOfTheGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}

