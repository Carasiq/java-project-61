package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void sayName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Say I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
}
