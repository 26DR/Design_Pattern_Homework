package com.company.state;

import com.company.products.PizzaOrder;

public class OrderInDeliveryState implements OrderState {
    @Override
    public void next(PizzaOrder pizzaOrder) {
        pizzaOrder.setState(new OrderReceivedState());
    }

    @Override
    public void prev(PizzaOrder pizzaOrder) {
        pizzaOrder.setState(new OrderMadeState());
    }

    @Override
    public void printStateStatus() {
        System.out.println("The pizza is being delivered");
    }
}
