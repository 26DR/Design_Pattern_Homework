package com.company.state;

import com.company.products.Pizza;

public class OrderInDeliveryState implements OrderState {
    @Override
    public void next(Pizza pizza) {
        pizza.setState(new OrderReceivedState());
    }

    @Override
    public void prev(Pizza pizza) {
        pizza.setState(new OrderMadeState());
    }

    @Override
    public void printStateStatus() {
        System.out.println("The pizza is being delivered");
    }
}
