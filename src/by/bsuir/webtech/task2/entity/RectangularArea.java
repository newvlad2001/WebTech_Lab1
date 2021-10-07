package by.bsuir.webtech.task2.entity;

public class RectangularArea {
    private final Rectangle[] rectangles;

    public RectangularArea(Rectangle... rectangles) {
        this.rectangles = rectangles;
    }

    public Rectangle[] getRectangles() {
        return rectangles;
    }
}
