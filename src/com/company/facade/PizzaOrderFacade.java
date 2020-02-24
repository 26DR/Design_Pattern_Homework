package com.company.facade;

import com.company.decorator.PizzaOrderExtraIngerdientsAdder;
import com.company.products.PizzaOrder;

public interface PizzaOrderFacade {
    boolean placeOrder(PizzaOrder pizzaOrder, PizzaOrderExtraIngerdientsAdder pizzaExtraIngerdientsAdder);
}
