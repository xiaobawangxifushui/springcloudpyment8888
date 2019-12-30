package com.yycompany.springcloud.service.impl;



import com.yycompany.springcloud.dao.PaymentDao;
import com.yycompany.springcloud.entities.Payment;
import com.yycompany.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public void create(Payment payment) {
        paymentDao.create(payment);

    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
