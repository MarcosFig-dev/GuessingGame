package guessinggame;
import java.util.Random;

public class RandomNumberGenerator {
    private final Random random;

    public RandomNumberGenerator() {
        this.random = new Random();
    }

    public int generateRandomNumber() {
        return random.nextInt(50) + 1;     }
}
