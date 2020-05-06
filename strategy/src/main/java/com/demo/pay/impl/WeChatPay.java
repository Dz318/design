package com.demo.pay.impl;/***
 * Created by dz on 2020-4-30
 */

import com.demo.pay.AbstractPay;
import com.demo.pay.BasePay;
import com.demo.pay.Pay;
import org.springframework.context.annotation.DependsOn;

import java.math.BigDecimal;

/**
 * @author dz
 * @version 1.0
 * @description
 * @createDate 2020-4-30 15:42
 **/
@Pay(3)
@DependsOn("BeanUtil")
public class WeChatPay extends AbstractPay implements BasePay {
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
