package com.company.products;

import com.company.state.OrderMadeState;
import com.company.state.OrderState;

public abstract class Pizza {

    private String nameOfThePizza;
    private double priceOfThePizza;
    private String ingredients;

    public void setState(OrderState state) {
        this.state = state;
    }

    private OrderState state = new OrderMadeState();

    public Pizza() {
    }

    Pizza(String nameOfThePizza, double priceOfThePizza, String ingredients) {
        this.nameOfThePizza = nameOfThePizza;
        this.priceOfThePizza = priceOfThePizza;
        this.ingredients = ingredients;
    }

    public String getNameOfThePizza() {
        return nameOfThePizza;
    }

    public void setNameOfThePizza(String nameOfThePizza) {
        this.nameOfThePizza = nameOfThePizza;
    }

    public double getPriceOfThePizza() {
        return priceOfThePizza;
    }

    public void setPriceOfThePizza(double priceOfThePizza) {
        this.priceOfThePizza = priceOfThePizza;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public abstract String addIngredients();

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printCurrentStateStatus() {
        state.printStateStatus();
    }

}
