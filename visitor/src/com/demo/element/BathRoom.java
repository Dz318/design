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
 * @createDate 2020-4-30 11:10
 **/
public class BathRoom extends Place {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitBathRoom(this);
    }

    public void washing(){
        System.out.println("洗洗手。。。。。*/");
    }
}
