package wordcounter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        int totalWords = 0;

        try {
            File file = new File("sample.txt"); // fichier à lire
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.trim().split("\\s+"); // séparation par espace
                totalWords += words.length;
            }

            scanner.close();
            System.out.println("Nombre total de mots : " + totalWords);
        } catch (FileNotFoundException e) {
            System.out.println("Fichier non trouvé.");
        }

        // Test conditionnel :
        int dogs = 1;
        int cats = 2;

        if (dogs > 0 && cats == 0) {
            if (dogs > 1) {
                System.out.println("Dog lover");
            } else {
                System.out.println("Dog person");
            }
        } else if (cats > 0 && dogs == 0) {
            if (cats > 1) {
                System.out.println("Cat lover");
            } else {
                System.out.println("Cat person");
            }
            System.out.println("Meow!");
        } else if (cats > 0 && dogs > 0) {
            if (dogs > cats) {
                System.out.println("I guess you like dogs more");
            } else if (dogs == cats) {
                System.out.println("I guess you like both equally");
            } else {
                System.out.println("I guess you like cats more");
            }
        } else {
            System.out.println("What, don’t you like pets?");
        }
    }
}
