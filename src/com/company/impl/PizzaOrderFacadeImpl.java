package com.company.impl;

import com.company.decorator.PizzaExtraIngerdientsAdder;
import com.company.facade.PizzaOrderFacade;
import com.company.products.Pizza;
import com.company.services.DeliveryService;
import com.company.services.PaymentService;

public class PizzaOrderFacadeImpl implements PizzaOrderFacade {


    @Override
    public boolean placeOrder(Pizza pizza, PizzaExtraIngerdientsAdder pizzaExtraIngerdientsAdder) {

        boolean orderCompleted = false;

        //Decorator to dynamically extend pizzas objects behaviour during the run time without changing the object itself
        System.out.println("Ingredients: " + pizzaExtraIngerdientsAdder.addIngredients() + " , order total(with extra toppings): " + pizzaExtraIngerdientsAdder.increasePizzaPrice() + "$");
        boolean paymentConfirmed = PaymentService.makePayment(pizzaExtraIngerdientsAdder.increasePizzaPrice());

        if (paymentConfirmed) {
            DeliveryService deliveryService = new DeliveryService();
            deliveryService.deliverOrder(pizza);
            System.out.println("Pizza delivery started");
            orderCompleted = true;
        }

        return orderCompleted;
    }
}
