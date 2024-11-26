package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void pointOfTheGame() {
        switch (Engine.getRandomNum3()) {
            case (1):
                Engine.setTrueAnswer(Integer.toString(Engine.getRandomNum1() + Engine.getRandomNum2()));
                Engine.setTask(Engine.getRandomNum1() + " + " + Engine.getRandomNum2());
                break;
            case (2):
                Engine.setTrueAnswer(Integer.toString(Engine.getRandomNum1() - Engine.getRandomNum2()));
                Engine.setTask(Engine.getRandomNum1() + " - " + Engine.getRandomNum2());
                break;
            case (3):
                Engine.setTrueAnswer(Integer.toString(Engine.getRandomNum1() * Engine.getRandomNum2()));
                Engine.setTask(Engine.getRandomNum1() + " * " + Engine.getRandomNum2());
                break;
        }
    }

    public static void conditionOfTheGame() {
        System.out.println("What is the result of the expression?");
    }

    public static int randomNumber() {
        int upperBound = 4;
        Random random = new Random();
        return random.nextInt(1, upperBound);
    }
}
