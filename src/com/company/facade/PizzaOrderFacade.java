package com.company.facade;

import com.company.decorator.PizzaExtraIngerdientsAdder;
import com.company.products.Pizza;

public interface PizzaOrderFacade {
    boolean placeOrder(Pizza pizza, PizzaExtraIngerdientsAdder pizzaExtraIngerdientsAdder);
}
