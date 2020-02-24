package com.company;

import com.company.decorator.ExtraCheese;
import com.company.factories.BasePizzaFactory;
import com.company.factories.PizzaFactory;
import com.company.impl.PizzaOrderFacadeImpl;
import com.company.products.Pizza;
import com.controllers.OrderController;

public class Main {

    public static void main(String[] args) {

        BasePizzaFactory basePizzaFactory = new PizzaFactory();
        OrderController orderController = new OrderController();

        //Factory method to create pizza objects without specifying the exact pizza class to create
        Pizza pizza = basePizzaFactory.createPizza("cheese");

        //Facade for encapsulating a more complex subsystem, decorator pattern in facades implementation
        orderController.setPizzaOrderFacade(new PizzaOrderFacadeImpl());
        orderController.orderPizza(pizza, new ExtraCheese(pizza));

        //Prints final state of pizza delivery after it has been done (state design pattern)
        pizza.printCurrentStateStatus();

    }
}
