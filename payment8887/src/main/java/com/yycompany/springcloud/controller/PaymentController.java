package com.yycompany.springcloud.controller;


import com.yycompany.springcloud.entities.CommonResult;
import com.yycompany.springcloud.entities.Payment;
import com.yycompany.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        System.out.println("8002");
        paymentService.create(payment);
        return new CommonResult(200,"payment action success",payment);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        System.out.println("8002");
        return new CommonResult(200,"get success",payment);
    }
}
