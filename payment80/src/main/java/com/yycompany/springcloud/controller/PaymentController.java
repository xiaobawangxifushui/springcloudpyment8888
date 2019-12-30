package com.yycompany.springcloud.controller;


import com.yycompany.springcloud.entities.CommonResult;
import com.yycompany.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class PaymentController {
    private final String PRUDUCER_URL = "http://cloud-payment-service";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/cus/payment/create")
    public CommonResult create(Payment payment){
        return restTemplate.postForObject(PRUDUCER_URL+"/payment/create",payment, CommonResult.class);
    }

    @GetMapping("/cus/payment/get/{id}")
    public CommonResult getById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PRUDUCER_URL+"/payment/get/"+id,CommonResult.class,id);

    }

}
