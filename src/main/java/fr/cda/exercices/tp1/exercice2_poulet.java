package fr.cda.exercices.tp1;

import java.util.Scanner;

public class exercice2_poulet {

    /**
     * Main function calculates the price including tax from a price excluding tax.
     */
    public static void main (String[] args) {

        Scanner scanner = new Scanner( System.in );

        System.out.println("Veuillez saisir un prix HT : ");
        float priceHT = scanner.nextFloat();
        checkPositive(priceHT);

        float priceTTC = (float) (priceHT * 1.20);
        System.out.println("Le prix TTC est de : " + priceTTC);
    }

    /**
     * Private function that check if a value is positive.
     */
    private static void checkPositive(float price) {
        if (price < 0) {
            throw new IllegalArgumentException("Le prix doit être positif !");
        }
    }
}