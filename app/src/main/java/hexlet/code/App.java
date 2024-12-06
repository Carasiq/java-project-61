package hexlet.code;
import hexlet.code.games.*;

import java.util.Scanner;

class App {

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
        int gameNumber = scanner.nextInt();
        switch (gameNumber) {
            case 1:
                sayName();
                break;
            case 2:
                Engine.logic(Even.logic(), Even.conditionOfTheGame());
                break;
            case 3:
                Engine.logic(Calc.logic(), Calc.conditionOfTheGame());
                break;
            case 4:
                Engine.logic(GCD.logic(), GCD.conditionOfTheGame());
                break;
            case 5:
                Engine.logic(Progression.logic(), Progression.conditionOfTheGame());
                break;
            case 6:
                Engine.logic(Prime.logic(), Prime.conditionOfTheGame());
                break;
            default:

        }

    }
    public static void sayName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                \nWelcome to the Brain Games!
                May I have your name?""");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }
}
