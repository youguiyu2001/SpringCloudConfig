package com.you.springcloud.controller;

import com.you.springcloud.config.CommonResult;
import com.you.springcloud.entity.Payment;
import com.you.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverport;

    @GetMapping("/getallpayment/{id}")
    public CommonResult getAllpayment(@PathVariable("id") Long id){
        Payment payment = paymentService.getById(id);
        if (payment==null){
         return    new CommonResult(404,"这是一个错误的页面",payment);
        }else{
         return    new CommonResult(200,"恭喜你,成功啦!!!你得到的信息是:",payment);
        }
    }
    @RequestMapping("/payment/lb")
    public String getId(){
        return serverport;
    }
}
