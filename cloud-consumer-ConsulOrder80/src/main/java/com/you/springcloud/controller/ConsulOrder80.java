package com.you.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class ConsulOrder80 {

    private static  final  String  url = "http://consul-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order/get")
    public String getPaymentById(){
        String result =restTemplate.getForObject(url+"/payment/consul",String.class);
        return result;
    }
}
