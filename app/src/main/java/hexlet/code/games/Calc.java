package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void pointOfTheGame() {
        if (Engine.randomNum3 == 1) {
            Engine.trueAnswer = Integer.toString(Engine.randomNum1 + Engine.randomNum2);
            Engine.task = Engine.randomNum1 + " + " + Engine.randomNum2;
        }
        if (Engine.randomNum3 == 2) {
            Engine.trueAnswer = Integer.toString(Engine.randomNum1 - Engine.randomNum2);
            Engine.task = Engine.randomNum1 + " - " + Engine.randomNum2;
        }
        if (Engine.randomNum3 == 3) {
            Engine.trueAnswer = Integer.toString(Engine.randomNum1 * Engine.randomNum2);
            Engine.task = Engine.randomNum1 + " * " + Engine.randomNum2;
        }
    }

    public static void conditionOfTheGame() {
        System.out.println("What is the result of the expression?");
    }

    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(1, 4);
    }

}

