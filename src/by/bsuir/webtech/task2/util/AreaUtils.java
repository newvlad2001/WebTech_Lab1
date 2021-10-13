package by.bsuir.webtech.task2.util;

import by.bsuir.webtech.task2.entity.Rectangle;
import by.bsuir.webtech.task2.entity.RectangularArea;

public class AreaUtils {
    private AreaUtils() {}

    public static boolean contains(Rectangle rect, double x, double y) {
        return (x >= rect.getX() && x <= rect.getX1() && y <= rect.getY() && y >= rect.getY1());
    }

    public static boolean contains(RectangularArea area, double x, double y) {
        for (var rect : area.getRectangles()) {
            if (contains(rect, x, y)) {
                return true;
            }
        }
        return false;
    }
}
