package fr.cda.exercices.tp1;

import java.util.Scanner;

public class exercice3_poulet {

    /**
     * Main function calculates the price including tax from a price excluding tax.
     */
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir un nombre : ");

        int num = scanner.nextInt();
        checkValid(num);

        int reversedNum = reverseNumber(num);

        boolean isPalindrome = num == reversedNum;

        System.out.println("Palindrome ? " + isPalindrome);
    }


    /**
     * reverseNumber is private function that reverse a number.
     * @param num number to reverse.
     * @return reversed number.
     */
    private static int reverseNumber(int num) {
        // Init une variable qui contiendra par étape le nombre inversé
        int reverse = 0;

        // Boucle qui continue tant que le nombre n'est pas 0
        while (num != 0){

            // Stock le modulo de 10 du nombre à inverser
            int remainder = num % 10;

            // Ajoute chiffre à reverse, après avoir décalé les chiffres de reverse vers la gauche
            reverse = reverse * 10 + remainder;

            // Enleve dernier chiffre de num
            num = num / 10;
        }
        return reverse;
    }

    /**
     * checkValid is a private function that check if the number is positive and have at least 2 numbers.
     * @param num number to check.
     */
    private static void checkValid(int num) {
        if (num < 10) {
            throw new IllegalArgumentException("Le nombre doit être positif et contenir au moins 2 chiffres !");
        }
    }
}