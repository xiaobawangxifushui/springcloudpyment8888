package com.yycompany.springcloud.dao;

import com.yycompany.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface PaymentDao {
    public void create(Payment payment);
    public Payment getPaymentById(Long id);
    void update(@Param("payment") Payment payment);

    void delById(Long id);

    List<Payment> list();
}
