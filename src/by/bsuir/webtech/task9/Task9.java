package by.bsuir.webtech.task9;

import by.bsuir.webtech.task9.entity.Ball;
import by.bsuir.webtech.task9.entity.Basket;
import by.bsuir.webtech.task9.entity.Color;
import by.bsuir.webtech.task9.logic.BasketCalc;
import by.bsuir.webtech.task9.logic.impl.BasketCalcImpl;

public class Task9 {
    public static void main(String[] args) {
        var basket = new Basket();
        BasketCalc basketCalc = new BasketCalcImpl();

        basket.addBall(new Ball(Color.BLACK, 4.6));
        basket.addBall(new Ball(Color.BLUE, 3.6));
        basket.addBall(new Ball(Color.RED, 2.0));
        basket.addBall(new Ball(Color.BLUE, 1.9));
        System.out.println("Weight: " + basketCalc.getWeight(basket) +
                "\nAmount of blue balls: " + basketCalc.countBlueBalls(basket));
    }
}
