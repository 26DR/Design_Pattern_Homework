package com.company.state;

import com.company.products.PizzaOrder;

public class OrderReceivedState implements OrderState {
    @Override
    public void next(PizzaOrder pizzaOrder) {
        System.out.println("The pizza is already delivered to the customer");
    }

    @Override
    public void prev(PizzaOrder pizzaOrder) {
        pizzaOrder.setState(new OrderInDeliveryState());
    }

    @Override
    public void printStateStatus() {
        System.out.println("The pizza is delivered");
    }
}
