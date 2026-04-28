package com.example.learninterface;

public class AliPayPaymentService implements PaymentService {
    @Override
    public void pay(Double amount) {
        System.out.println("AliPay payment " + amount + " RMB");
    }
}
