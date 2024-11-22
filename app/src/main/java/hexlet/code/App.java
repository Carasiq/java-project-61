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
                0 - Exit""");
        System.out.print("\nYour choice: ");
        gameNumber = scanner.nextInt();

        if (gameNumber == 1) {
            sayName();
        }

        if (gameNumber == 2) {
            sayName();
            Engine.parityCheck();
        }
        if (gameNumber == 3) {
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
