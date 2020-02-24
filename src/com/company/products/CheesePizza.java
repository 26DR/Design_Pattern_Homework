package com.company.products;

public class CheesePizza extends Pizza{


    public CheesePizza(String nameOfThePizza, double priceOfThePizza, String ingredients) {
        super(nameOfThePizza, priceOfThePizza, ingredients);
    }

    @Override
    public String addIngredients() {
        return getIngredients();
    }
}
