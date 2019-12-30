package com.yycompany.springcloud.service;


import com.yycompany.springcloud.entities.Payment;

import java.util.List;


public interface PaymentService {
    public void create(Payment payment);
    public Payment getPaymentById(Long id);
    public void update(Payment payment);
    public void delById(Long id);
    public List<Payment> list();
}
