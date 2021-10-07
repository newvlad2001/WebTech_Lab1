package by.bsuir.webtech.task3.util;

import java.util.TreeMap;

public class CalculatorUtils {

    private CalculatorUtils() {}

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
