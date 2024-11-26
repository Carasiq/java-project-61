package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void pointOfTheGame() {
        final int actionWithAPlus = 1;
        final int actionWithAMinus = 2;
        final int actionWithAMultiplication = 3;
        switch (Engine.getRandomNum3()) {
            case (actionWithAPlus):
                Engine.setTrueAnswer(Integer.toString(Engine.getRandomNum1() + Engine.getRandomNum2()));
                Engine.setTask(Engine.getRandomNum1() + " + " + Engine.getRandomNum2());
                break;
            case (actionWithAMinus):
                Engine.setTrueAnswer(Integer.toString(Engine.getRandomNum1() - Engine.getRandomNum2()));
                Engine.setTask(Engine.getRandomNum1() + " - " + Engine.getRandomNum2());
                break;
            case (actionWithAMultiplication):
                Engine.setTrueAnswer(Integer.toString(Engine.getRandomNum1() * Engine.getRandomNum2()));
                Engine.setTask(Engine.getRandomNum1() + " * " + Engine.getRandomNum2());
                break;
            default:
        }
    }

    public static void conditionOfTheGame() {
        System.out.println("What is the result of the expression?");
    }

    public static int randomNumber() {
        final int upperBound = 4;
        Random random = new Random();
        return random.nextInt(1, upperBound);
    }
}
