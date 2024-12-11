package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

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
        final int greet = 1;
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;
        switch (gameNumber) {
            case greet:
                sayName();
                break;
            case even:
                Engine.logic(Even.logic(), Even.conditionOfTheGame());
                break;
            case calc:
                Engine.logic(Calc.logic(), Calc.conditionOfTheGame());
                break;
            case gcd:
                Engine.logic(GCD.logic(), GCD.conditionOfTheGame());
                break;
            case progression:
                Engine.logic(Progression.logic(), Progression.conditionOfTheGame());
                break;
            case prime:
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
