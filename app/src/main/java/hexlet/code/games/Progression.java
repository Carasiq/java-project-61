package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void pointOfTheGame() {
        int step = randomNumber();
        int selectionOfNumber = randomNumber();
        Engine.setTask("");
        int result = 0;
        final int lengthOfProgression = 10;

        for (int i = 0; i <= lengthOfProgression; ++i) {
            result = result + Engine.getRandomNum1() + step;
            Engine.setTask(Engine.getTask() + " " + result);

            if (i == selectionOfNumber) {
                result = result + Engine.getRandomNum1() + step;
                Engine.setTrueAnswer("" + result);
                Engine.setTask(Engine.getTask() + " ..");
            }

        }
        Engine.setTask(Engine.getTask().trim());
    }

    public static void conditionOfTheGame() {
        System.out.println("What number is missing in the progression?");
    }


    public static int randomNumber() {
        final int upperBound = 10;
        Random random = new Random();
        return random.nextInt(1, upperBound);
    }
}
