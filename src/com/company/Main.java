package com.company;

import com.company.factories.BasePizzaFactory;
import com.company.factories.PizzaFactory;

public class Main {

    public static void main(String[] args) {

        BasePizzaFactory basePizzaFactory = new PizzaFactory();
        basePizzaFactory.createPizza("cheese");
    }
}
