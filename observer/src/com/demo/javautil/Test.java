package com.demo.javautil;/***
 * Created by dz on 2020-5-7
 */

/**
 * @author dz
 * @version 1.0
 * @description
 * @createDate 2020-5-7 9:55
 **/
public class Test {
    public static void main(String[] args) {
        Stock stock = new Stock(Stock.StockState.FALL, 14.7D, 13.2D);
        stock.addObserver(new Investor());

        stock.setPrice(13.7);
        stock.setPrice(12.7);
        stock.setPrice(14.0);
    }
}
