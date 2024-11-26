package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void pointOfTheGame() {
        if (Engine.getRandomNum1() % 2 != 0) {
            Engine.setTrueAnswer("no");
        }
        if (Engine.getRandomNum1() % 2 == 0) {
            Engine.setTrueAnswer("yes");
        }
        Engine.setTask(Integer.toString(Engine.getRandomNum1()));
    }

    public static void conditionOfTheGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}

