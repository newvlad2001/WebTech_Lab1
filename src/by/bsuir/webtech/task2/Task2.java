package by.bsuir.webtech.task2;

import by.bsuir.webtech.services.input.impl.ConsoleReader;
import by.bsuir.webtech.services.input.Reader;
import by.bsuir.webtech.services.output.impl.ConsoleWriter;
import by.bsuir.webtech.services.output.Writer;
import by.bsuir.webtech.task2.entity.Rectangle;
import by.bsuir.webtech.task2.entity.RectangularArea;
import by.bsuir.webtech.task2.util.AreaUtils;

public class Task2 {
    public static void main(String[] args) {
        double x;
        double y;
        boolean result;
        var area = new RectangularArea(
                new Rectangle(-4, 5, 8, 5),
                new Rectangle(-6, 0, 12, 3));
        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();

        writer.writeln("Input x coordinate of the point:");
        x = reader.readDouble();
        writer.writeln("Input y coordinate of the point:");
        y = reader.readDouble();
        result = AreaUtils.contains(area, x, y);
        writer.writef("The area contains a point (%.2f,%.2f): %s\n", x, y, result);
    }


}
