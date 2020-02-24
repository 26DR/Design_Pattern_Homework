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
                pizzaToCreate = new CheesePizza("Cheese Pizza", 12.99);
                break;
            case "pepperoni":
                pizzaToCreate = new PepperoniPizza("Cheese Pizza", 16.99);
                break;
            default:
                throw new IllegalArgumentException("Such pizza is not offered");
        }

        pizzaToCreate.addIngredients();
        pizzaToCreate.bakePizza();
        return pizzaToCreate;
    }
}
