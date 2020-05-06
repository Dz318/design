package com.demo.simplefactory;/***
 * Created by dz on 2020-4-23
 */

/**
 * @author dz
 * @version 1.0
 * @description
 * @return
 * @exception
 * @createDate 2020-4-23 11:04
 **/
public class BMWFactory {
    public BMW create(int type){
        switch (type){
            case 520:
                return new BMW520();
            case 720:
                return new BMW720();
            default:
                break;
        }
        return null;
    }
}
