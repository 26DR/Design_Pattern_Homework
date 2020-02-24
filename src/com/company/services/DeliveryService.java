package com.company.services;

import com.company.products.Pizza;

public class DeliveryService {
    public void deliverOrder(Pizza pizza){
        //Pizza is being delivered
        pizza.nextState();
    }
}
