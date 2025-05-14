package jeuDeDevine;

import java.util.Scanner;
import java.util.Random;

public class JeuDeDevine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int nombreAleatoire = random.nextInt(100) + 1;

        int essais = 0;
        boolean aGagne = false;

        System.out.println("Bienvenue dans le jeu de devinettes !");
        System.out.println("Devine un nombre entre 1 et 100. Tu as 10 essais.");

        while (essais < 10) {
            System.out.print("Essai " + (essais + 1) + " : ");
            int devinette = scanner.nextInt();
            essais++;

            if (devinette == nombreAleatoire) {
                aGagne = true;
                break;
            } else if (devinette < nombreAleatoire) {
                System.out.println("Trop petit !");
            } else {
                System.out.println("Trop grand !");
            }
        }

        if (aGagne) {
            System.out.println("Félicitations ! Tu as deviné le nombre en " + essais + " essais.");
        } else {
            System.out.println("Désolé ! Tu as utilisé tes 10 essais. Le nombre était : " + nombreAleatoire);
        }

        scanner.close();
    }
}
