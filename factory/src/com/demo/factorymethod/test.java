package com.demo.factorymethod;/***
 * Created by dz on 2020-4-23
 */

/**
 * @author dz
 * @version 1.0
 * @description
 * @return
 * @exception
 * @createDate 2020-4-23 11:13
 **/
public class test {
    public static void main(String[] args) {
        new FactoryBMW520().createBMW();
        new FactoryBMW720().createBMW();
    }
}
