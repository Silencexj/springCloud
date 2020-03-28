package com.xije.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jie
 * @date 2020/3/26
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return  new RandomRule();//定义为随机
    }
}
