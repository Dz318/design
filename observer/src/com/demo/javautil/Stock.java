package com.demo.javautil;/***
 * Created by dz on 2020-5-6
 */

import java.util.Observable;

/**
 * @author dz
 * @version 1.0
 * @description 股票类
 * @createDate 2020-5-6 16:09
 **/
public class Stock extends Observable {

    /**
    * @description 股票状态 RISE:涨 FALL:跌
    * @author      dz
    * @date        2020-5-6 16:43
    **/
    public enum StockState{
        RISE,FALL
    }

    private StockState state;

    private double  price;

    private double LowsetPrice;

    public Stock(){

    }

    public Stock(StockState state, double price, double lowsetPrice) {
        this.state = state;
        this.price = price;
        LowsetPrice = lowsetPrice;
    }

    public StockState getState() {
        return state;
    }

    public void setState(StockState state) {
        this.state = state;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < this.price) {
            setState(StockState.FALL);
        } else {
            setState(StockState.RISE);
        }
        if (price < this.LowsetPrice) {
            setLowsetPrice(price);
        }
        this.price = price;
        // 更新股票状态标记为已改变
        this.setChanged();
        // 通知观察者
        notifyObservers();
    }

    public double getLowsetPrice() {
        return LowsetPrice;
    }

    public void setLowsetPrice(double lowsetPrice) {
        LowsetPrice = lowsetPrice;
    }
}
