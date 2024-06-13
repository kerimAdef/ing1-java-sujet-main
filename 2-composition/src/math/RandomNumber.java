package math;
import java.util.Random;
public class RandomNumber {

    private Random random;

    public RandomNumber() {
        this.random = new Random();
    }
    public int nextInt(int bound) {
        return random.nextInt(bound);
    }
    public static int getRandomNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

}
