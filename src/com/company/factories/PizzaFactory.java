package com.company.factories;

import com.company.products.CheesePizzaOrder;
import com.company.products.PepperoniPizzaOrder;
import com.company.products.PizzaOrder;

//Factory Method pattern
public class PizzaFactory extends BasePizzaFactory {

    @Override
    public PizzaOrder createPizza(String pizzaType) {
        PizzaOrder pizzaOrderToCreate;

        switch (pizzaType.toLowerCase()){
            case "cheese":
                pizzaOrderToCreate = new CheesePizzaOrder("Cheese Pizza", 12.99, "cheese, tomato paste");
                break;
            case "pepperoni":
                pizzaOrderToCreate = new PepperoniPizzaOrder("Cheese Pizza", 16.99, "cheese, tomato paste, pepperoni");
                break;
            default:
                throw new IllegalArgumentException("Such pizza is not offered");
        }

        System.out.println(pizzaOrderToCreate.getNameOfThePizza() + " has to be made:");

        return pizzaOrderToCreate;
    }
}
