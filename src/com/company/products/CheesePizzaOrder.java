package com.company.products;

public class CheesePizzaOrder extends PizzaOrder {


    public CheesePizzaOrder(String nameOfThePizza, double priceOfThePizza, String ingredients) {
        super(nameOfThePizza, priceOfThePizza, ingredients);
    }

    @Override
    public String addIngredients() {
        return getIngredients();
    }
}
