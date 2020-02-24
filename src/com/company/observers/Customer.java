package com.company.observers;

public class Customer implements Observer {
    @Override
    public void getDeliveryUpdate(Observer observer, String nameOfThePizza) {
        System.out.println("NOTIFICATION TO THE CUSTOMER SENT: Hello, pizza order delivery has been started! {" + nameOfThePizza + "}");
    }
}
