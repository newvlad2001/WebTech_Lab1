package by.bsuir.webtech.task2.area;

public class RectangularArea {

    private final Rectangle[] area;

    public RectangularArea(Rectangle... rectangles) {
        area = rectangles;
    }

    public boolean contains(double x, double y) {
        for (var rect : area) {
            if (rect.isContains(x, y)) {
                return true;
            }
        }
        return false;
    }
}
