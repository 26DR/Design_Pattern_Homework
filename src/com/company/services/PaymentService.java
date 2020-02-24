package com.company.services;

public class PaymentService {
    public static boolean makePayment(double totalPrice){
        System.out.println("Payment of " + totalPrice + "$ received");
        return true;
    }
}
