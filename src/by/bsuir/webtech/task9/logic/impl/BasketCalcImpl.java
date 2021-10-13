package by.bsuir.webtech.task9.logic.impl;

import by.bsuir.webtech.task9.entity.Ball;
import by.bsuir.webtech.task9.entity.Basket;
import by.bsuir.webtech.task9.entity.Color;
import by.bsuir.webtech.task9.logic.BasketCalc;

public class BasketCalcImpl implements BasketCalc {
    @Override
    public double getWeight(Basket b) {
        double result = 0;

        for (Ball ball : b.getContent()) {
            result += ball.getWeight();
        }
        return result;
    }

    @Override
    public int countBlueBalls(Basket b) {
        int result = 0;

        for (Ball ball : b.getContent()) {
            if (ball.getColor() == Color.BLUE) {
                result++;
            }
        }
        return result;
    }
}
