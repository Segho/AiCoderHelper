package com.example.learninterface;

public class OrderService {
    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    void order(double amount) {
        paymentService.pay(amount);
    }
}
