import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator {
    private static final int BOUND = 1025;

    @Override
    public int generateNumber() {
        return new Random().nextInt(BOUND);
    }
}
