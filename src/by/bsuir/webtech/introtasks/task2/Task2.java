package by.bsuir.webtech.introtasks.task2;

import by.bsuir.webtech.introtasks.services.input.impl.ConsoleReader;
import by.bsuir.webtech.introtasks.services.input.interfaces.Reader;
import by.bsuir.webtech.introtasks.services.output.impl.ConsoleWriter;
import by.bsuir.webtech.introtasks.services.output.interfaces.Writer;
import by.bsuir.webtech.introtasks.task2.rectangle.Rectangle;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        double x;
        double y;
        boolean result;
        var area = new ArrayList<Rectangle>();
        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();

        area.add(new Rectangle(-4, 5, 8, 5));
        area.add(new Rectangle(-6, 0, 12, 3));

        writer.writeln("Input x coordinate of the point:");
        x = reader.readDouble();
        writer.writeln("Input y coordinate of the point:");
        y = reader.readDouble();
        result = isContains(area, x, y);
        writer.writef("The area contains a point (%.2f,%.2f): %s\n", x, y, result);
    }

    public static boolean isContains(ArrayList<Rectangle> area, double x, double y) {
        for (var rect : area) {
            if (rect.isContains(x, y)) {
                return true;
            }
        }
        return false;
    }
}
