/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abdulsalam.design.pattern.java.factory;

/**
 *
 * @author abdulsalam
 */

public class PaymentGateway {
    private final iPaymentProcess paymentMethod;

    public PaymentGateway(iPaymentProcess paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        boolean isTransactionSucceed = this.paymentMethod.pay(amount);        
        if (!isTransactionSucceed) {
            System.out.print("Transaction Fails");
        }
        
        // Do other logics...
    }
}
