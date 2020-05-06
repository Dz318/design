package com.demo.pay;

import org.reflections.Reflections;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Set;

/**
 * pay class context
 * @author dz
 */
public class PayContext {
    private static PayContext context = new PayContext();

    private static HashMap<Integer,String> map = new HashMap<>();

    private BasePay basePay;

    public PayContext(){

    }

    public PayContext(BasePay basePay){
        this.basePay = basePay;
    }

    /**
     * @description 常规策略方式
     * @author      dz
     * @date        2020-4-30 16:53
     **/
    public BigDecimal payment(Integer channelId, Integer goodId){
        return basePay.payMent(channelId, goodId);
    }

    /**
     * @description 注解实现方式
     * @author      dz
     * @date        2020-4-30 16:53
     **/
    static {
        Reflections reflections = new Reflections("com.demo.pay.impl");
        // 获取配置Pay注解的实现类
        Set<Class<?>> bankList = reflections.getTypesAnnotatedWith(Pay.class);
        for (Class clazz : bankList) {
            Pay t = (Pay) clazz.getAnnotation(Pay.class);
            // 获取注解的值(支付类型)和实现类名添加到Map中 注: 注解的值要和支付类型一致
            map.put(t.value(),clazz.getCanonicalName());
        }
    }


    /**
     * 通过支付类型创建支付接口
     * @return 具体的支付接口
     */
    public BasePay create(Integer channelId) throws Exception {
        String clazz = map.get(channelId);
        Class aClass = Class.forName(clazz);
        return (BasePay) aClass.newInstance();
    }
    /**
     * 工厂返回支付上下文对象
     * @return 上下文对象
     */
    public static PayContext getInstance(){
        return context;
    }
}
