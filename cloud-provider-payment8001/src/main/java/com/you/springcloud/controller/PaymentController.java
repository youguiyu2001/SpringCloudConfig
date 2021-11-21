package com.you.springcloud.controller;

import com.you.springcloud.config.CommResult;
import com.you.springcloud.entity.Payment;
import com.you.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverport;

    @GetMapping("/payment/get/{id}")
    public CommResult findByIdPayment(@PathVariable("id") Long id){
        Payment payment =paymentService.getById(id);
        if (payment==null){
            return new CommResult(404,"这是一个错误的页面",payment);
        }else{
            return new CommResult(200,serverport+"你得到的信息是:",payment);
        }
    }



    @RequestMapping("/crpayment")
    public CommResult creatPayment(Payment payment){
        boolean b = paymentService.save(payment);
        if (b==true){
            return  new CommResult(200,"你添加的信息是:",b);
        }else{
            return  new CommResult(404,"信息添加错误:",b);
        }
    }

    @RequestMapping("/payment/lb")
    public String getId(){
        return serverport;
    }
}
