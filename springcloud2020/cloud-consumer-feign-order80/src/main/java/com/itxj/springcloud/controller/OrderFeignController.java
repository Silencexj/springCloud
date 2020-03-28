package com.itxj.springcloud.controller;

import com.itxj.springcloud.entities.CommonResult;
import com.itxj.springcloud.entities.Payment;
import com.itxj.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jie
 * @date 2020/3/27
 */

@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeOut(){
        //openfegin-ribbon 客户端默认等待1秒钟
        return paymentFeignService.paymentFeignTimeOut();
    }
}