import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageManager {
    // Liste privée pour stocker les nombres
    private ArrayList<Integer> nombres;

    // Constructeur pour initialiser la liste
    public AverageManager() {
        this.nombres = new ArrayList<>();
    }

    // Méthode pour lire les nombres de l'utilisateur
    public void readNombre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez des nombres (entrez un nombre négatif pour terminer) : ");

        // Lecture continue des nombres jusqu'à l'entrée d'un nombre négatif
        while (true) {
            int n = sc.nextInt();
            if (n < 0) {
                break; // Arrêt de la lecture si le nombre est négatif
            }
            addNombre(n); // Ajout du nombre à la liste
        }
    }

    // Méthode pour ajouter un nombre à la liste
    public void addNombre(int n) {
        this.nombres.add(n);
    }

    // Méthode pour calculer la moyenne des nombres
    public double calculateAverage() {
        if (nombres.isEmpty()) {
            return 0; // Retourne 0 si la liste est vide
        }

        int somme = 0;
        // Somme de tous les nombres dans la liste
        for (int nombre : nombres) {
            somme += nombre;
        }

        // Calcul de la moyenne
        return (double) somme / nombres.size();
    }

    // Méthode pour afficher la moyenne des nombres
    public void displayAverage() {
        double average = calculateAverage();
        System.out.println("La moyenne est: " + average);
    }
}
