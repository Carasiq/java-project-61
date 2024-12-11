package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void logic(String[][] findings, String conditionOfTheGame) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(conditionOfTheGame);
        int i = 1;
        final int finalAttempt = 3;
        for (String[] strings : findings) {
            System.out.println("Question: " + strings[0] + "\nYour answer:");
            String answer = sc.next();

            if (answer.equals(strings[1])) {
                System.out.println("Correct!");

            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was '" + strings[1] + "'.\nLet's try again, " + name + "!");
                break;
            }
            if (i == finalAttempt) {
                System.out.println("Congratulations, " + name + "!");
            }
            ++i;
        }
    }
}
