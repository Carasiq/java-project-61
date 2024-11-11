package hexlet.code;
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "0 - Exit");
        System.out.print("Your choice: ");
        int gameNumber = scanner.nextInt();

        if (gameNumber == 1) {
            sayName();
        }

        if (gameNumber == 2) {
            sayName();
            Even.parityCheck();
        }
    }
    public static String userName;
    public static void sayName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.println("Say I have your name?");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
}
