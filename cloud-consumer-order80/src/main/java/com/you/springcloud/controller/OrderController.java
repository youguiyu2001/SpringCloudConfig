package com.you.springcloud.controller;

import com.you.springcloud.config.CommResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {

    @Autowired
     RestTemplate restTemplate;

    private static  final  String  url = "http://localhost:8001";

    @GetMapping("/order/get/{id}")
    public CommResult getPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForObject(url+"/getpayment/"+id,CommResult.class);
    }
}
