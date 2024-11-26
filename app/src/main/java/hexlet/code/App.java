package hexlet.code;
import java.util.Scanner;

class App {
    private static int gameNumber;

    public static int getGameNumber() {
        return gameNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        System.out.print("\nYour choice: ");
        gameNumber = scanner.nextInt();
        if (gameNumber == 1) {
            sayName();
        } else {
            sayName();
            Engine.logic();
        }
    }

    public static void sayName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                \nWelcome to the Brain Games!
                May I have your name?""");
        Engine.setUserName(scanner.next());
        System.out.println("Hello, " + Engine.getUserName() + "!");
    }
}
