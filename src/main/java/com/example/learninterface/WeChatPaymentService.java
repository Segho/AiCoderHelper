package com.example.learninterface;

public class WeChatPaymentService implements PaymentService {
    @Override
    public void pay(Double amount) {
        System.out.println("WeChat payment" + amount + " RMB");
    }
}
