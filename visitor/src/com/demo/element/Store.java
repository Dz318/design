package com.demo.element;/***
 * Created by dz on 2020-4-30
 */

import com.demo.visitor.Visitor;

/**
 * @author dz
 * @version 1.0
 * @description
 * @return
 * @exception
 * @createDate 2020-4-30 11:06
 **/
public class Store extends Place {

    @Override
    public void accept(Visitor visitor) {
        visitor.vistiStore(this);
    }

    public void shopping(){
        System.out.println("欢迎光临，祝您购物愉快*/");
    }
}
