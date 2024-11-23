package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void pointOfTheGame() {

        Engine.task = Integer.toString(Engine.randomNum1);
        Engine.trueAnswer = "yes";
        if(Engine.randomNum1 <= 2) {
            Engine.trueAnswer = "no";
        }

        for (int i = 2; i <= Engine.randomNum1 / 2; i++) {
            if (Engine.randomNum1 % i == 0) {
                Engine.trueAnswer = "no";
                break;
            }
        }
    }

    public static void conditionOfTheGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
}
