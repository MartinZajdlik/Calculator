package classes;

import operations.Addition;
import operations.Substraction;

public class BasicCalculator extends Calculator{

    public double add(double a, double b){

        Addition addition = new Addition();
        result = addition.calculate(a,b);
        return result;
    }

    public double subtract(double a, double b){

        Substraction substraction = new Substraction();
        result = substraction.calculate(a,b);
        return result;

    }



}
