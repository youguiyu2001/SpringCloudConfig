package com.you.springcloud.controller;

import com.you.springcloud.config.CommResult;
import com.you.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class FeignOrderController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @Value("${server.port}")
    private String serverport;


    @GetMapping("/feign/getpayment/{id}")
    public CommResult getpaymentById(@PathVariable("id") Long id){
        return paymentFeignService.findByIdPayment(id);
    }
}
