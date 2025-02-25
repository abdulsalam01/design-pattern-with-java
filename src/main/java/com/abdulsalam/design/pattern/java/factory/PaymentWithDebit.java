/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abdulsalam.design.pattern.java.factory;

/**
 *
 * @author abdulsalam
 */
public class PaymentWithDebit implements iPaymentProcess {

    @Override
    public boolean pay(double amount) {
        System.out.println("Payment with Debit " + amount);
        return true;
    }

}
