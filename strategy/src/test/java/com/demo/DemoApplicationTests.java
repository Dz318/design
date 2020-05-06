package com.demo;

import com.demo.pay.PayContext;
import com.demo.pay.impl.AliPay;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class DemoApplicationTests {

    //  名称        折扣   类型
    //  ICBC	    0.95	1
    //  AliPay	    0.9	    2
    //  WechatPay	1	    3
    @Test
    void annotationWay() {
        PayContext payContext = PayContext.getInstance();
        try {
            Integer chanelId = 2;
            BigDecimal amount = payContext.create(chanelId).payMent(chanelId, 3);
            System.err.println("共计金额:"+ amount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    @Test
    void BasePay() {
        PayContext payContext = new PayContext(new AliPay());
        BigDecimal amount = payContext.payment(2, 3);
        System.err.println("共计:" + amount);
    }
}
