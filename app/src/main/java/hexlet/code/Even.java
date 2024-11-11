package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Even {

    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static void parityCheck() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 1; true; ++i) {
            int num = randomNumber();
            System.out.println("Question: " + num);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);

            if (i == 3) {
                System.out.println("Congratulations, " + App.userName + " !");
                break;
            }
            if (num % 2 == 0 & answer.equals("yes")) {
                System.out.println("Correct!");
            }

            if (num % 2 != 0 & answer.equals("no")) {
                System.out.println("Correct!");
            }

            if (num % 2 == 0 & !answer.equals("yes")) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + App.userName + " !");
                break;
            }

            if (num % 2 != 0 & !answer.equals("no")) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + App.userName + " !");
                break;
            }
        }
    }
}
