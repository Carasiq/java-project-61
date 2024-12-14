package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int ATTEMPTS = 3;
    private static final int QUESTION = 0;
    private static final int ANSWER = 1;

    public static void logic(String[][] findings, String conditionOfTheGame) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(conditionOfTheGame);
        int i = 1;
        for (String[] strings : findings) {
            System.out.println("Question: " + strings[QUESTION] + "\nYour answer:");
            String scAnswer = sc.next();

            if (scAnswer.equals(strings[ANSWER])) {
                System.out.println("Correct!");

            } else {
                System.out.println("'" + scAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + strings[ANSWER] + "'.\nLet's try again, " + name + "!");
                break;
            }
            if (i == ATTEMPTS) {
                System.out.println("Congratulations, " + name + "!");
            }
            ++i;
        }
    }
}
