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
    public static iPaymentProcess pay(String type) {
        switch (type) {
            case "debit" -> { return new PaymentWithDebit(); }
            case "credit" -> { return new PaymentWithCredit(); }
        }
        
        return null;
    }
}
