package fr.cda.exercices.tp2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Thermometer thermometer = new Thermometer();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez une température en Celsius:");
        double celsius = scanner.nextDouble();
        thermometer.setTempInC(celsius);

        System.out.println("Temperature Fahrenheit: " + thermometer.getTempInF());
        System.out.println("Temperature Kelvin: " + thermometer.getTempInK());

        System.out.println("Entrez une température en Fahrenheit:");
        double fahrenheit = scanner.nextDouble();
        thermometer.setTempInF(fahrenheit);

        System.out.println("Temperature Celsius: " + thermometer.getTempInC());
        System.out.println("Temperature Kelvin: " + thermometer.getTempInK());

        System.out.println("Entrez une température en Kelvin:");
        double kelvin = scanner.nextDouble();
        thermometer.setTempInK(kelvin);

        System.out.println("Temperature Celsius: " + thermometer.getTempInC());
        System.out.println("Temperature Fahrenheit: " + thermometer.getTempInF());
    }
}