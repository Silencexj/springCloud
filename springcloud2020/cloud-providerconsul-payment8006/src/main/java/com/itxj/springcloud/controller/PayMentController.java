package com.itxj.springcloud.controller;


import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author jie
 * @date 2020/3/26
 */
@RestController
@Slf4j
public class PayMentController {
    @Value("${server.port}")
    private String serverPort;


    @RequestMapping("/payment/consul")
    public String paymentConsul() {
        return "springCloud with consul: " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
