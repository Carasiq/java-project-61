package hexlet.code;

import java.util.Random;

public class Utils {
    public static int randomNumber(int upperBound) {
        Random random = new Random();
        return random.nextInt(1, upperBound);
    }
}

