package compteurDeMots;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompteurDeMots {
    public static void main(String[] args) {
        int totalMots = 0;

        try {
            File fichier = new File("exemple.txt"); // fichier à lire
            Scanner scanner = new Scanner(fichier);

            while (scanner.hasNextLine()) {
                String ligne = scanner.nextLine();
                String[] mots = ligne.trim().split("\\s+"); // séparation par espace
                totalMots += mots.length;
            }

            scanner.close();
            System.out.println("Nombre total de mots : " + totalMots);
        } catch (FileNotFoundException e) {
            System.out.println("Fichier non trouvé.");
        }

        // Test conditionnel :
        int chiens = 1;
        int chats = 2;

        if (chiens > 0 && chats == 0) {
            if (chiens > 1) {
                System.out.println("Amateur de chiens");
            } else {
                System.out.println("Personne qui aime les chiens");
            }
        } else if (chats > 0 && chiens == 0) {
            if (chats > 1) {
                System.out.println("Amateur de chats");
            } else {
                System.out.println("Personne qui aime les chats");
            }
            System.out.println("Miaou !");
        } else if (chats > 0 && chiens > 0) {
            if (chiens > chats) {
                System.out.println("Je suppose que tu aimes plus les chiens");
            } else if (chiens == chats) {
                System.out.println("Je suppose que tu aimes les deux également");
            } else {
                System.out.println("Je suppose que tu aimes plus les chats");
            }
        } else {
            System.out.println("Quoi, tu n'aimes pas les animaux de compagnie ?");
        }
    }
}
