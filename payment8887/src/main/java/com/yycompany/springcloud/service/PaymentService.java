package com.yycompany.springcloud.service;


import com.yycompany.springcloud.entities.Payment;


public interface PaymentService {
    public void create(Payment payment);
    public Payment getPaymentById(Long id);
}
