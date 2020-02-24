package com.company.state;

import com.company.products.PizzaOrder;

public interface OrderState {

    void next(PizzaOrder pizzaOrder);
    void prev(PizzaOrder pizzaOrder);
    void printStateStatus();
}
