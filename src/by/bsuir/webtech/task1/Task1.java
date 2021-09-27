package by.bsuir.webtech.task1;

import by.bsuir.webtech.services.input.impl.ConsoleReader;
import by.bsuir.webtech.services.output.impl.ConsoleWriter;
import by.bsuir.webtech.services.input.interfaces.Reader;
import by.bsuir.webtech.services.output.interfaces.Writer;

public class Task1 {

    public static void main(String[] args) {
        double x;
        double y;
        double result;
        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();

        writer.writeln("Input x variable:");
        x = reader.readDouble();
        writer.writeln("Input y variable:");
        y = reader.readDouble();
        result = solveExpression(x, y);
        writer.writef("Expression result is: %f\n", x, y, result);
    }

    public static double solveExpression(double x, double y) {
        double result = (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - (2 * x) / (1 + x * x * y * y)));

        return result;
    }
}
