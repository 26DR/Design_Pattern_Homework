package com.company.products;

import com.company.observers.Observer;
import com.company.observers.Subject;
import com.company.state.OrderMadeState;
import com.company.state.OrderState;

import java.util.ArrayList;

public abstract class PizzaOrder implements Subject {


    private String nameOfThePizza;
    private double priceOfThePizza;
    private String ingredients;
    private Observer observer;
    private Boolean deliveryStarted = false;

    private ArrayList<Observer> observers = new ArrayList<>();
    private OrderState state = new OrderMadeState();

    public PizzaOrder() {
    }

    PizzaOrder(String nameOfThePizza, double priceOfThePizza, String ingredients) {
        this.nameOfThePizza = nameOfThePizza;
        this.priceOfThePizza = priceOfThePizza;
        this.ingredients = ingredients;
    }

    public String getNameOfThePizza() {
        return nameOfThePizza;
    }

    public void setNameOfThePizza(String nameOfThePizza) {
        this.nameOfThePizza = nameOfThePizza;
    }

    public double getPriceOfThePizza() {
        return priceOfThePizza;
    }

    public void setPriceOfThePizza(double priceOfThePizza) {
        this.priceOfThePizza = priceOfThePizza;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public OrderState getState() {
        return state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public Boolean getDeliveryStarted() {
        return deliveryStarted;
    }

    public void setDeliveryStarted(Boolean deliveryStarted) {
        this.deliveryStarted = deliveryStarted;
    }

    public void printCurrentStateStatus() {
        state.printStateStatus();
    }

    public abstract String addIngredients();

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void notifyObservers(String nameOfThePizza) {
        for (Observer ob : observers) {
            ob.getDeliveryUpdate(this.observer, nameOfThePizza);
        }
    }

    @Override
    public void sendNotification(Observer observer, String nameOfThePizza){
        if(deliveryStarted){
            this.observer = observer;
            notifyObservers(nameOfThePizza);
        }
    }

    }
