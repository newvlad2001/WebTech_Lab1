package by.bsuir.webtech.task3;

import by.bsuir.webtech.services.input.impl.ConsoleReader;
import by.bsuir.webtech.services.input.interfaces.Reader;
import by.bsuir.webtech.services.output.impl.ConsoleWriter;
import by.bsuir.webtech.services.output.interfaces.Writer;
import by.bsuir.webtech.task3.calculator.Calculator;

import java.util.Map;

public class Task3 {

    static Writer writer = new ConsoleWriter();

    public static void main(String[] args) {
        double h;
        double a;
        double b;
        Reader reader = new ConsoleReader();
        Map<Double, Double> result;

        writer.writeln("Input the left border of the range: ");
        a = reader.readDouble();
        writer.writeln("Input the right border of the range: ");
        b = reader.readDouble();
        writer.writeln("Input the step for calculations: ");
        h = reader.readDouble();
        result = Calculator.calculateFunctionInRange(a, b, h);
        printResultTable(result);
    }

    public static void printResultTable(Map<Double, Double> resultTable) {
        for (var i : resultTable.keySet()) {
            writer.writef("%10.2f | %f\n", i, resultTable.get(i));
        }
    }
}


