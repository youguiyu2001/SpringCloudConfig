package com.you.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulPayment8003 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulPayment8003.class,args);
    }
}
