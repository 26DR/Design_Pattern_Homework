package com.company.state;

import com.company.products.Pizza;

public class OrderMadeState implements OrderState {

    @Override
    public void next(Pizza pizza) {
        pizza.setState(new OrderInDeliveryState());
    }

    @Override
    public void prev(Pizza pizza) {
        System.out.println("The pizza is waiting for delivery");
    }

    @Override
    public void printStateStatus() {
        System.out.println("The pizza is ordered, waiting for delivery");
    }
}
