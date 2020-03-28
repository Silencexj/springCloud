package com.itxj.springcloud.service.impl;

import com.itxj.springcloud.entities.Payment;
import com.itxj.springcloud.dao.PaymentDao;
import com.itxj.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jie
 * @date 2020/3/23
 */
@Service
public class PaymentServiceImpl  implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
