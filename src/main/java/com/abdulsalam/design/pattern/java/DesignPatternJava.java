/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.abdulsalam.design.pattern.java;

import com.abdulsalam.design.pattern.java.factory.PaymentGateway;
import com.abdulsalam.design.pattern.java.factory.PaymentWithCredit;
import com.abdulsalam.design.pattern.java.factory.PaymentWithDebit;

/**
 *
 * @author abdulsalam
 */
public class DesignPatternJava {

    public static void main(String[] args) {
        // Beginning of Factory Pattern.
        PaymentWithDebit pDebit = new PaymentWithDebit();
        PaymentWithCredit pCredit = new PaymentWithCredit();

        PaymentGateway pGateway = new PaymentGateway(pDebit);
        pGateway.processPayment(1000);
        // End of Factory Pattern.
    }
}
