package com.company.state;

import com.company.products.Pizza;

public class OrderReceivedState implements OrderState {
    @Override
    public void next(Pizza pizza) {
        System.out.println("The pizza is already delivered to the customer");
    }

    @Override
    public void prev(Pizza pizza) {
        pizza.setState(new OrderInDeliveryState());
    }

    @Override
    public void printStateStatus() {
        System.out.println("The pizza is delivered");
    }
}
