package com.company.services;

import com.company.products.PizzaOrder;

public class DeliveryService {
    public void deliverOrder(PizzaOrder pizzaOrder){
        //Pizza is being delivered
        pizzaOrder.nextState();
  }
}
