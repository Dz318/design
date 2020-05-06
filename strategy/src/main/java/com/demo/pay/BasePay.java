package com.demo.pay;

import java.math.BigDecimal;

/**
 * 支付接口
 * @author dz
 */
public interface BasePay {
    /**
     * 抽象支付方法
     * @param channelId 支付类型ID
     * @param goodId 商品ID
     * @return 支付金额
     */
    BigDecimal payMent(Integer channelId, Integer goodId);
}
