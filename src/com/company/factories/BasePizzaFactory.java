package com.company.factories;

import com.company.products.Pizza;

public abstract class BasePizzaFactory {

    public abstract Pizza createPizza(String pizzaType);
}
