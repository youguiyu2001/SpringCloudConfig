package com.you.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallBackService implements PaymentHystrixService  {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallBackService fall back-paymentInfo_OK ,哈哈哈哈哈";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallBackService fall back-paymentInfo_TimeOut ,啦啦啦啦";
    }
}
