package com.controllers;

import com.company.decorator.PizzaOrderExtraIngerdientsAdder;
import com.company.facade.PizzaOrderFacade;
import com.company.products.PizzaOrder;

public class OrderController {

    private PizzaOrderFacade pizzaOrderFacade;
    private boolean orderCompleted;

    public void orderPizza(PizzaOrder pizzaOrderToOrder, PizzaOrderExtraIngerdientsAdder pizzaExtraIngerdientsAdder){
        orderCompleted = pizzaOrderFacade.placeOrder(pizzaOrderToOrder, pizzaExtraIngerdientsAdder);
    }

    public void setPizzaOrderFacade(PizzaOrderFacade pizzaOrderFacade) {
        this.pizzaOrderFacade = pizzaOrderFacade;
    }
}
