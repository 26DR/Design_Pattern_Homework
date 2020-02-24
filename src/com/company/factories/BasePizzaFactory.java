package com.company.factories;

import com.company.products.PizzaOrder;

public abstract class BasePizzaFactory {

    public abstract PizzaOrder createPizza(String pizzaType);
}
