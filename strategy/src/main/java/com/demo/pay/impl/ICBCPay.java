package com.demo.pay.impl;

import com.demo.pay.AbstractPay;
import com.demo.pay.BasePay;
import com.demo.pay.Pay;
import org.springframework.context.annotation.DependsOn;

import java.math.BigDecimal;

/**
 *  aliPay implements
 * @author dz
 */
@Pay(1)
/**
 * 因为BaseService中构造器需要使用applicationContextUtil这个bean，所以需要加@DependsOn这个注解。
 *注解作用：1、保证applicationContextUtil总是在MyService之前实例化
 *       2、保证applicationContextUtil总是在MyService销毁之后销毁
 */
@DependsOn("BeanUtil")
public class ICBCPay extends AbstractPay implements BasePay {
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
