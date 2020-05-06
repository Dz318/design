package com.demo.pay;/***
 * Created by dz on 2020-4-30
 */

import com.demo.entity.Goods;
import com.demo.entity.PayWay;
import com.demo.service.GoodsService;
import com.demo.service.PayWayService;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author dz
 * @version 1.0
 * @description
 * @createDate 2020-4-30 15:43
 **/
public abstract class AbstractPay extends BeanUtils {
    @Resource
    protected GoodsService goodsService;
    @Resource
    protected PayWayService payWayService;

    public AbstractPay(){
        this.goodsService = (GoodsService) getObject("goodsService");
        this.payWayService = (PayWayService) getObject("payWayService");
    }
    /**
    * 通过支付类型计算物品最终价格
    * @param channelId :
    * @param goodId :
    * @return PayAmount 支付金额
    * @author      dz
    * @date        2020-4-30 16:08
    **/
    protected BigDecimal payment(Integer channelId, Integer goodId){
        Goods goods = goodsService.selectByPrimaryKey(goodId);
        PayWay payWay = payWayService.selectByType(channelId);
        if (null!=goods && payWay!=null) {
            return BigDecimal.valueOf(goods.getPrice()*payWay.getDiscount());
        } else {
            return null;
        }
    }
}
