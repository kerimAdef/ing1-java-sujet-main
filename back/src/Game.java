public class Game {
    private int targetNumber;
    private Player player;

    public Game(NumberGenerator numberGenerator, Player player) {
        this.targetNumber = numberGenerator.generateNumber();
        this.player = player;
    }

    public void start() {
        boolean found = false;
        while (!found) {
            int guess = player.guessNumber();
            found = checkGuess(guess);
        }
    }

    private boolean checkGuess(int guess) {
        if (guess > targetNumber) {
            System.out.println("Le nombre à deviner est plus petit.");
            return false;
        } else if (guess < targetNumber) {
            System.out.println("Le nombre à deviner est plus grand.");
            return false;
        } else {
            System.out.println("Félicitations! Vous avez trouvé le nombre.");
            return true;
        }
    }
}
