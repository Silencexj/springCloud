package com.itxj.springcloud.service;

import com.itxj.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author jie
 * @date 2020/3/23
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
