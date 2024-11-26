package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void pointOfTheGame() {
        Engine.setTask(Engine.getRandomNum1() + " " + Engine.getRandomNum2());

        while (Engine.getRandomNum2() != 0) {
            int tmp = Engine.getRandomNum1() % Engine.getRandomNum2();
            Engine.setRandomNum1(Engine.getRandomNum2());
            Engine.setRandomNum2(tmp);
        }
        Engine.setTrueAnswer("" + Engine.getRandomNum1());
    }

    public static void conditionOfTheGame() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }
}

