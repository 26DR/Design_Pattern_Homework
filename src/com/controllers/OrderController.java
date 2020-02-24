package com.controllers;

import com.company.decorator.PizzaExtraIngerdientsAdder;
import com.company.facade.PizzaOrderFacade;
import com.company.products.Pizza;

public class OrderController {

    private PizzaOrderFacade pizzaOrderFacade;
    private boolean orderCompleted;

    public void orderPizza(Pizza pizzaToOrder, PizzaExtraIngerdientsAdder pizzaExtraIngerdientsAdder){
        orderCompleted = pizzaOrderFacade.placeOrder(pizzaToOrder, pizzaExtraIngerdientsAdder);
        System.out.println("Pizza order done");
    }

    public void setPizzaOrderFacade(PizzaOrderFacade pizzaOrderFacade) {
        this.pizzaOrderFacade = pizzaOrderFacade;
    }
}
