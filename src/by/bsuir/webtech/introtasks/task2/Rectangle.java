package by.bsuir.webtech.introtasks.task2;

public class Rectangle {

    private double x;
    private double y;
    private double x1;
    private double y1;

    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.x1 = x + width;
        this.y1 = y - height;
    }

    public double[] getCoords()
    {
        double[] result = new double[] {x, y, x1, y1};

        return result;
    }

    public boolean isContains(double x, double y) {
        boolean result = (x >= this.x && x <= this.x1 && y <= this.y && y >= this.y1);

        return result;
    }
}
