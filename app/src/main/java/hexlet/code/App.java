package hexlet.code;
import java.util.Scanner;

class App {
    public static int gameNumber;

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
        }
        else {
            sayName();
            Engine.parityCheck();
        }
    }

    public static void sayName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                
                Welcome to the Brain Games!
                Say I have your name?""");
        Engine.userName = scanner.next();
        System.out.println("Hello, " + Engine.userName + "!");
    }
}
