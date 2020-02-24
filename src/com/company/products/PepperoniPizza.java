package com.company.products;

public class PepperoniPizza extends Pizza{

    public PepperoniPizza(String nameOfThePizza, double priceOfThePizza, String ingredients) {
        super(nameOfThePizza, priceOfThePizza, ingredients);
    }

    @Override
    public String addIngredients() {
        return getIngredients();
    }
}
