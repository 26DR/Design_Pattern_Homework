package com.company.impl;

import com.company.decorator.PizzaOrderExtraIngerdientsAdder;
import com.company.facade.PizzaOrderFacade;
import com.company.products.PizzaOrder;
import com.company.services.DeliveryService;
import com.company.services.PaymentService;

public class PizzaOrderFacadeImpl implements PizzaOrderFacade {


    @Override
    public boolean placeOrder(PizzaOrder pizzaOrder, PizzaOrderExtraIngerdientsAdder pizzaExtraIngerdientsAdder) {

        boolean orderCompleted = false;

        //Decorator to dynamically extend pizzas objects behaviour during the run time without changing the object itself
        System.out.println("Ingredients: " + pizzaExtraIngerdientsAdder.addIngredients() + " , order total(with extra toppings): " + pizzaExtraIngerdientsAdder.increasePizzaPrice() + "$");
        boolean paymentConfirmed = PaymentService.makePayment(pizzaExtraIngerdientsAdder.increasePizzaPrice());

        if (paymentConfirmed) {
            pizzaOrder.printCurrentStateStatus();
            //Pizza is ready for delivery
            pizzaOrder.nextState();
            DeliveryService deliveryService = new DeliveryService();
            deliveryService.deliverOrder(pizzaOrder);
            orderCompleted = true;
        }

        return orderCompleted;
    }
}
