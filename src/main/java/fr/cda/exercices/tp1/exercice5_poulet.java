package fr.cda.exercices.tp1;

import java.util.HashMap;
import java.util.Map;

public class exercice5_poulet {

    public static void main(String[] args) {
        System.out.println(convertRomanToArabic("X"));       // 10
        System.out.println(convertRomanToArabic("LVIII"));  // 58
        System.out.println(convertRomanToArabic("IV"));  // 4
    }

    /** generateRomanToArabicMap returns a HashMap which contains the mapping between roman numbers and arabic */
    public static Map<Character, Integer> generateRomanToArabicMap() {
        Map<Character, Integer> romanToArabicMap = new HashMap<>();
        romanToArabicMap.put('I', 1);
        romanToArabicMap.put('V', 5);
        romanToArabicMap.put('X', 10);
        romanToArabicMap.put('L', 50);
        romanToArabicMap.put('C', 100);
        romanToArabicMap.put('D', 500);
        romanToArabicMap.put('M', 1000);

        return romanToArabicMap;
    }

    /** convertRomanToArabic convert roman number to arabic equivalent
     * @param romanNumber number to convert
     * @return arabicNumber after conversion of romanNumber
     */
    public static int convertRomanToArabic(String romanNumber) {
        Map<Character, Integer> romanToArabicMap = generateRomanToArabicMap();
        int arabicNumber = 0;

        for (int i = 0; i < romanNumber.length(); i++) {


            arabicNumber += romanToArabicMap.get(romanNumber.charAt(i));
        }

        return arabicNumber;
    }

}