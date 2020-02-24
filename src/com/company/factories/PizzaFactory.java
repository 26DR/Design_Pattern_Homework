package com.company.factories;

import com.company.products.CheesePizza;
import com.company.products.PepperoniPizza;
import com.company.products.Pizza;

//Factory Method pattern
public class PizzaFactory extends BasePizzaFactory {

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizzaToCreate;

        switch (pizzaType.toLowerCase()){
            case "cheese":
                pizzaToCreate = new CheesePizza("Cheese Pizza", 12.99, "cheese, tomato paste");
                break;
            case "pepperoni":
                pizzaToCreate = new PepperoniPizza("Cheese Pizza", 16.99, "cheese, tomato paste, pepperoni");
                break;
            default:
                throw new IllegalArgumentException("Such pizza is not offered");
        }

        System.out.println(pizzaToCreate.getNameOfThePizza() + " has to be made:");

        return pizzaToCreate;
    }
}
