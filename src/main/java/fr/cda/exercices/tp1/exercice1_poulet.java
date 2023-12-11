package fr.cda.exercices.tp1;

import java.util.Scanner;

public class exercice1_poulet {

    /**
     * Main function that averages the entered notes.
     */
    public static void main (String[] args) {

        Scanner scanner = new Scanner( System.in );

        System.out.println("Veuillez saisir la 1ere note : ");
        int note1 = scanner.nextInt();
        checkValue(note1);

        System.out.println("Veuillez saisir la 2eme note : ");
        int note2 = scanner.nextInt();
        checkValue(note2);

        System.out.println("Veuillez saisir la 3eme note : ");
        int note3 = scanner.nextInt();
        checkValue(note3);

        int moyenne = (note1 + note2 + note3) / 3;
        System.out.println("La moyenne des notes est : " + moyenne);

    }

    /**
     * Private function that check if a value is between 0 and 20.
     */
    private static void checkValue(int note) {
        if (note < 0 || note > 20) {
            throw new IllegalArgumentException("Veuillez saisir une note entre 0 & 20 !");
        }
    }
}