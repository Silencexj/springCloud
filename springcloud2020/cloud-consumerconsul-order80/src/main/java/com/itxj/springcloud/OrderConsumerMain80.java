package com.itxj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jie
 * @date 2020/3/26
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsumerMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsumerMain80.class, args);
    }
}
