package com.demo.factorymethod;/***
 * Created by dz on 2020-4-23
 */

/**
 * @author dz
 * @version 1.0
 * @description
 * @return
 * @exception
 * @createDate 2020-4-23 11:12
 **/
public class FactoryBMW520 implements BMWFactory{

    @Override
    public BMW createBMW() {
        return new BMW520();
    }
}
