/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.abdulsalam.design.pattern.java;

import com.abdulsalam.design.pattern.java.factory.PaymentGateway;
import com.abdulsalam.design.pattern.java.singleton.GameManager;

/**
 *
 * @author abdulsalam
 */
public class DesignPatternJava {

    public static void main(String[] args) {
        // Beginning of Factory Pattern.
        PaymentGateway.pay("debit"); // Use the PayWithDebit.java class.
        // End of Factory Pattern.
        
        // Beginning of Singleton Pattern.
        GameManager gm1 = GameManager.getInstance();
        GameManager gm2 = GameManager.getInstance();
        
        System.out.println(gm1 == gm2);
        // End of Singleton Pattern.        
    }
}
