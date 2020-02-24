package com.company.decorator;

import com.company.products.Pizza;

public class ExtraCheese extends PizzaExtraIngerdientsAdder {

    private Pizza pizza;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String addIngredients() {
        return pizza.getIngredients() + " with extra cheese";
    }

    public double increasePizzaPrice(){
        return pizza.getPriceOfThePizza() + 0.99;
    }
}
