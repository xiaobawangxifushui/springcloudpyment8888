package com.yycompany.springcloud.dao;

import com.yycompany.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface PaymentDao {
    public void create(Payment payment);
    public Payment getPaymentById(Long id);
}
