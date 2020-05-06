package com.demo.simplefactory;/***
 * Created by dz on 2020-4-23
 */

/**
 * @author dz
 * @version 1.0
 * @description
 * @return
 * @exception
 * @createDate 2020-4-23 11:08
 **/
public class test {
    public static void main(String[] args) {
        BMWFactory factory = new BMWFactory();
        BMW bmw520 = factory.create(520);
        BMW bmw720 = factory.create(720);
    }
}

