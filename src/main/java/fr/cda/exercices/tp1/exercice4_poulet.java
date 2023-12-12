package fr.cda.exercices.tp1;

import java.util.Arrays;
import java.util.HashMap;
public class exercice4_poulet {
        public static void main(String[] args) {

            int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 7};

            String arrayString1 = " Doublon ? = " + haveDuplicate(array1);
            String arrayString2 = " Doublon ? = " + haveDuplicate(array2);

            System.out.println(arrayString1 + " Doublon ? = " + haveDuplicate(array1));
            System.out.println(arrayString2 + " Doublon ? = " + haveDuplicate(array2));
        }

    /** containsDuplicate using HashMap to see if the array contains a double */
        public static boolean haveDuplicate(int[] tableau) {
            HashMap<Integer, Boolean> elements = new HashMap<>();

            for (int element : tableau) {
                if (elements.containsKey(element)) {
                    return true;
                } else {
                    elements.put(element, true);
                }
            }
            return false;
        }
    }
