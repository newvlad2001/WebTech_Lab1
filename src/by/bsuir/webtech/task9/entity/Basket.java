package by.bsuir.webtech.task9.entity;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Ball> content = new ArrayList<>();

    public void addBall(Ball ball) {
        content.add(ball);
    }

    public List<Ball> getContent() {
        return content;
    }
}
