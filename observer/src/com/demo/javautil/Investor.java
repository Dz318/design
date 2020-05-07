package com.demo.javautil;/***
 * Created by dz on 2020-5-7
 */

import java.util.Observable;
import java.util.Observer;

/**
 * @author dz
 * @version 1.0
 * @description
 * @createDate 2020-5-7 9:51
 **/
public class Investor implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Stock stock = (Stock) o;
        if(stock.getPrice()==stock.getLowsetPrice())
        {
            System.out.println("股票已经跌到历史最低了，我得赶紧抄底...");
        }
        else{
            if(stock.getState().equals(Stock.StockState.RISE)){
                System.out.println("股票在涨，目前价格："+stock.getPrice());
            }
            else{
                System.out.println("股票在跌，目前价格："+stock.getPrice());
            }
        }
    }
}
