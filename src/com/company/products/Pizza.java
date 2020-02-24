package com.company.products;

public abstract class Pizza {

    private String nameOfThePizza;
    private double priceOfThePizza;

    Pizza(String nameOfThePizza, double priceOfThePizza) {
        this.nameOfThePizza = nameOfThePizza;
        this.priceOfThePizza = priceOfThePizza;
    }

    public abstract void addIngredients();

    public void bakePizza(){
        System.out.println("Pizza baked");
    }
}
