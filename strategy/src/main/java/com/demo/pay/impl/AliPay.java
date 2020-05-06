package com.demo.pay.impl;

import com.demo.pay.AbstractPay;
import com.demo.pay.BasePay;
import com.demo.pay.Pay;
import org.springframework.context.annotation.DependsOn;

import java.math.BigDecimal;

/**
 * 支付实现类
 * @author dz
 */
@Pay(2)
@DependsOn("BeanUtil")
public class AliPay extends AbstractPay implements BasePay {
    @Override
    public BigDecimal payMent(Integer channelId, Integer goodId) {
        /**
         *  ....
         *  其他业务逻辑
         *  ....
         **/
        // 调用父类计算方法
        return super.payment(channelId, goodId);
    }
}
