package by.bsuir.webtech.task9.logic;

import by.bsuir.webtech.task9.entity.Basket;

public interface BasketCalc {
    double getWeight(Basket b);

    int countBlueBalls(Basket b);
}
