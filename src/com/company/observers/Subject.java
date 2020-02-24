package com.company.observers;

public interface Subject {
    void registerObserver(Observer observer);
    void notifyObservers(String nameOfThePizza);
    void sendNotification(Observer observer, String nameOfThePizza);
}
