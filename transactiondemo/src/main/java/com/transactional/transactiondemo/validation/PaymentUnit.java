package com.transactional.transactiondemo.validation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


public class PaymentUnit {
    private static Map<String, Double> payment = new HashMap<>();

    static
    {       payment.put("account1", 13000.0);
        payment.put("account2", 15000.0);
        payment.put("account3", 16000.0);
        payment.put("account4", 9000.0);
        payment.put("account5", 11000.0);
    }


    public static boolean validateCreditAmount(String accountNo, Double paidAmount){
        if (paidAmount > payment.get(accountNo))
            throw new IllegalStateException("Insufficient account balance");
        else
            return true;
    }
}
