package com.company.products;

public class PepperoniPizza extends Pizza{

    public PepperoniPizza(String nameOfThePizza, double priceOfThePizza) {
        super(nameOfThePizza, priceOfThePizza);
    }

    @Override
    public void addIngredients() {
        System.out.println("Adding ingredients for pepperoni pizza");
    }
}
