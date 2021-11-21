package com.you.springcloud.service;

import com.you.springcloud.config.CommResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
@Component
public interface PaymentFeignService {

    @GetMapping("/getpayment/{id}")
    public CommResult findByIdPayment(@PathVariable("id") Long id);
}
