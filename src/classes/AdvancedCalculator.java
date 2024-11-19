package classes;

import operations.Division;
import operations.Multiplication;

public class AdvancedCalculator extends Calculator{

    public double multiply(double a, double b){

        Multiplication multiplication = new Multiplication();
        result = multiplication.calculate(a,b);
        return result;
    }

    public double divide(double a, double b){

        Division division = new Division();
        result = division.calculate(a,b);
        return result;

    }

}
