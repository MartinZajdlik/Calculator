import classes.AdvancedCalculator;
import classes.BasicCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Inicializace Scanneru pro vstupy z konzole

        // Požadujeme od uživatele první číslo
        System.out.print("Zadej první číslo: ");
        double firstNumber = scanner.nextDouble();

        // Požadujeme od uživatele operaci
        System.out.print("Zadej operaci (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // Požadujeme od uživatele druhé číslo
        System.out.print("Zadej druhé číslo: ");
        double secondNumber = scanner.nextDouble();

        // V závislosti na zvolené operaci provádíme výpočet
        try {
            double result = 0;
            if (operation == '+' || operation == '-') {
                BasicCalculator basicCalculator = new BasicCalculator();
                if (operation == '+') {
                    result = basicCalculator.add(firstNumber, secondNumber);
                } else if (operation == '-') {
                    result = basicCalculator.subtract(firstNumber, secondNumber);
                }
            } else if (operation == '*' || operation == '/') {
                AdvancedCalculator advancedCalculator = new AdvancedCalculator();
                if (operation == '*') {
                    result = advancedCalculator.multiply(firstNumber, secondNumber);
                } else if (operation == '/') {
                    result = advancedCalculator.divide(firstNumber, secondNumber);
                }
            } else {
                System.out.println("Neplatná operace.");
                return; // Ukončí program, pokud je zadaná operace neplatná
            }

            System.out.println("Výsledek: " + result); // Výpis výsledku

        } catch (ArithmeticException e) {
            System.out.println("Chyba: " + e.getMessage()); // Ošetření chybového dělení nulou
        }
    }
}