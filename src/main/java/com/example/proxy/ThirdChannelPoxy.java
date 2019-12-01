package com.example.proxy;

public class ThirdChannelPoxy implements Payment {
    private Payment payment;
    private PaymentLogger paymentLogger=new PaymentLogger();

    public ThirdChannelPoxy(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String pay(String uid) {
        paymentLogger.log(uid);
        return payment.pay(uid);
    }
}
