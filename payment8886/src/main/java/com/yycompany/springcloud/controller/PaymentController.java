package com.yycompany.springcloud.controller;


import com.yycompany.springcloud.entities.CommonResult;
import com.yycompany.springcloud.entities.Payment;
import com.yycompany.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        System.out.println("8001");
        paymentService.create(payment);
        return new CommonResult(200,"payment action success",payment);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        System.out.println("8001");
        Payment payment = paymentService.getPaymentById(id);
        return new CommonResult(200,"get success",payment);
    }
    @GetMapping("/payment/update")
    public CommonResult update(Payment payment){
        System.out.println("8001");
        paymentService.update(payment);
        return new CommonResult(200,"get success",payment);
    }

    @GetMapping("/payment/del/{id}")
    public CommonResult del(@PathVariable("id") Long id){
        System.out.println("8001");
        paymentService.delById(id);
        return new CommonResult(200,"get success",id);
    }
    @GetMapping("/payment/list")
    public CommonResult list(){
        System.out.println("8001");
        List<Payment> list = paymentService.list();
        return new CommonResult(200,"get success",list);
    }

}
