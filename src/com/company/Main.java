package com.company;

import com.company.decorator.ExtraCheese;
import com.company.decorator.PizzaExtraIngerdientsAdder;
import com.company.factories.BasePizzaFactory;
import com.company.factories.PizzaFactory;
import com.company.products.Pizza;

public class Main {

    public static void main(String[] args) {

        //Factory method to create pizza objects without specifying the exact pizza class to create
        BasePizzaFactory basePizzaFactory = new PizzaFactory();
        Pizza pizza = basePizzaFactory.createPizza("cheese");
        //Decorator to dynamically extend pizzas objects behaviour during the run time without changing the object itself
        PizzaExtraIngerdientsAdder pizzaExtraIngerdientsAdder = new ExtraCheese(pizza);
        System.out.println("Ingredients: " + pizzaExtraIngerdientsAdder.addIngredients() + " , new order total: " + pizzaExtraIngerdientsAdder.increasePizzaPrice() + "$");
    }
}
