package com.company.state;

import com.company.observers.Customer;
import com.company.observers.Observer;
import com.company.observers.Subject;
import com.company.products.PizzaOrder;

public class OrderMadeState implements OrderState {

    @Override
    public void next(PizzaOrder pizzaOrder) {
        pizzaOrder.setState(new OrderInDeliveryState());
        pizzaOrder.setDeliveryStarted(true);

        //prints the current state - orderMadeState
        pizzaOrder.printCurrentStateStatus();
        //Notification to the observer
        Observer pizzaPlaceCustomer = new Customer();
        ((Subject) pizzaOrder).registerObserver(pizzaPlaceCustomer);
        ((Subject) pizzaOrder).sendNotification(pizzaPlaceCustomer, pizzaOrder.getNameOfThePizza());
    }

    @Override
    public void prev(PizzaOrder pizzaOrder) {
        System.out.println("The pizza is waiting for delivery");
    }

    @Override
    public void printStateStatus() {
        System.out.println("The pizza is ready, waiting for delivery");
    }
}
