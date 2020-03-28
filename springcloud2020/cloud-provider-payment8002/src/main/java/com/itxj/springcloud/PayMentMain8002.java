package com.itxj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import sun.applet.Main;

/**
 * @author jie
 * @date 2020/3/23
 */
@SpringBootApplication
@EnableEurekaClient
public class PayMentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain8002.class, args);
    }
}
