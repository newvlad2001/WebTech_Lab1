package by.bsuir.webtech.task3.calculator;

import java.util.TreeMap;

public class Calculator {

    private Calculator() {}

    public static double calculateFunction(double x) {
        double result = Math.tan(x);

        return result;
    }

    public static TreeMap<Double, Double> calculateFunctionInRange(double lBorder, double rBorder, double step) {
        var result = new TreeMap<Double, Double>();

        for (double i = lBorder; i <= rBorder; i += step) {
            result.put(i, calculateFunction(i));
        }
        return result;
    }
}
