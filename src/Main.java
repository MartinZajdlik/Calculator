import classes.AdvancedCalculator;
import classes.BasicCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("First number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Second number: ");
        double secondNumber = scanner.nextDouble();


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
                System.out.println("Invalid operation.");
                return;
            }

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}