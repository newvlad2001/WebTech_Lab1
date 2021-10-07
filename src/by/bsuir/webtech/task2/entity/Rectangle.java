package by.bsuir.webtech.task2.entity;

public class Rectangle {

    private final double x;
    private final double y;
    private final double x1;
    private final double y1;

    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.x1 = x + width;
        this.y1 = y - height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }
}
