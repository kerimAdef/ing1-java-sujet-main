import java.util.Scanner;

public class Player {
    private Scanner scanner;

    public Player() {
        this.scanner = new Scanner(System.in);
    }

    public int guessNumber() {
        System.out.print("Devinez le nombre: ");
        return scanner.nextInt();
    }
}
