package com.company.state;

import com.company.products.Pizza;

public interface OrderState {

    void next(Pizza pizza);
    void prev(Pizza pizza);
    void printStateStatus();
}
