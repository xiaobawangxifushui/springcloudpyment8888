package com.yycompany.springcloud.service.impl;



import com.yycompany.springcloud.dao.PaymentDao;
import com.yycompany.springcloud.entities.Payment;
import com.yycompany.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public void update(Payment payment) {
        paymentDao.update(payment);
    }

    @Override
    public void delById(Long id) {
        paymentDao.delById(id);
    }

    @Override
    public List<Payment> list() {
        return paymentDao.list();
    }
}
