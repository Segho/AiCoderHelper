package com.example.learninterface;

class OrderServiceTest {
    static void main(String[] args) {
        // orientate interface
        PaymentService ali = new AliPayPaymentService();
        PaymentService wechat = new WeChatPaymentService();
        OrderService orderService1 = new OrderService(ali);
        OrderService orderService2 = new OrderService(wechat);
        orderService1.order(100);

        // old way
        WeChatPaymentService weChatPaymentService=new WeChatPaymentService();
        weChatPaymentService.pay(200.0);

    }


}