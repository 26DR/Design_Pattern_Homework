package com.company.products;

public class CheesePizza extends Pizza{

    public CheesePizza(String nameOfThePizza, double priceOfThePizza) {
        super(nameOfThePizza, priceOfThePizza);
    }

    @Override
    public void addIngredients() {
        System.out.println("Adding ingredients for cheese pizza");
    }
}
