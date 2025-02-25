/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.abdulsalam.design.pattern.java;

import com.abdulsalam.design.pattern.java.factory.PaymentGateway;

/**
 *
 * @author abdulsalam
 */
public class DesignPatternJava {

    public static void main(String[] args) {
        // Beginning of Factory Pattern.
        PaymentGateway.pay("debit"); // Use the PayWithDebit.java class.
        // End of Factory Pattern.
    }
}
