public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        Player player = new Player();
        Game game = new Game(numberGenerator, player);
        game.start();
    }
}
