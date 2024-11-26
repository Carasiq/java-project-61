package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void pointOfTheGame() {

        Engine.setTask(Integer.toString(Engine.getRandomNum1()));
        Engine.setTrueAnswer("yes");
        if (Engine.getRandomNum1() < 2) {
            Engine.setTrueAnswer("no");
        }

        for (int i = 2; i <= Engine.getRandomNum1() / 2; i++) {
            if (Engine.getRandomNum1() % i == 0) {
                Engine.setTrueAnswer("no");
                break;
            }
        }
    }

    public static void conditionOfTheGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
}
