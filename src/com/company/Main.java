package com.company;

import com.company.decorator.ExtraCheese;
import com.company.factories.BasePizzaFactory;
import com.company.factories.PizzaFactory;
import com.company.impl.PizzaOrderFacadeImpl;
import com.company.products.Pizza;
import com.controllers.OrderController;

public class Main {

    public static void main(String[] args) {

        //Factory method to create pizza objects without specifying the exact pizza class to create
        BasePizzaFactory basePizzaFactory = new PizzaFactory();
        Pizza pizza = basePizzaFactory.createPizza("cheese");

        //Facade for encapsulating a more complex subsystem, decorator pattern in facades implementation
        OrderController orderController = new OrderController();
        orderController.setPizzaOrderFacade(new PizzaOrderFacadeImpl());
        orderController.orderPizza(pizza, new ExtraCheese(pizza));

    }
}
