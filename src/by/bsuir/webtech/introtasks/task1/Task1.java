package by.bsuir.webtech.introtasks.task1;

import by.bsuir.webtech.introtasks.services.impl.ConsoleReader;
import by.bsuir.webtech.introtasks.services.interfaces.Reader;

public class Task1 {

    public static void main(String[] args) {
        double x;
        double y;
        double result;
        Reader reader = new ConsoleReader();

        System.out.println("Input x variable:");
        x = reader.readDouble();
        System.out.println("Input y variable:");
        y = reader.readDouble();
        result = solveExpression(x, y);
        System.out.printf("Expression result is: %f\n", result);
    }

    public static double solveExpression(double x, double y) {
        double result = (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - (2 * x) / (1 + x * x * y * y)));
        return result;
    }
}
