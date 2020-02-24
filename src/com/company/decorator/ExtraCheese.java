package com.company.decorator;

import com.company.products.PizzaOrder;

public class ExtraCheese extends PizzaOrderExtraIngerdientsAdder {

    private PizzaOrder pizzaOrder;

    public ExtraCheese(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public String addIngredients() {
        return pizzaOrder.getIngredients() + " with extra cheese";
    }

    public double increasePizzaPrice(){
        return pizzaOrder.getPriceOfThePizza() + 0.99;
    }
}
