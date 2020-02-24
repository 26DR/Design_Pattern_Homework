package com.company.products;

public class PepperoniPizzaOrder extends PizzaOrder {

    public PepperoniPizzaOrder(String nameOfThePizza, double priceOfThePizza, String ingredients) {
        super(nameOfThePizza, priceOfThePizza, ingredients);
    }

    @Override
    public String addIngredients() {
        return getIngredients();
    }
}
