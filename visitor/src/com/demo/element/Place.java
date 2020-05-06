package com.demo.element;


import com.demo.visitor.Visitor;

/**
 * @author dz
 * @version 1.0
 * @description
 * @return
 * @exception
 * @createDate 2020-4-30 11:03
 **/
public abstract class Place {

    /**
    * 接收访问者访问
    * @author      dz
    * @date        2020-4-30 11:04
    **/
    public abstract void accept(Visitor visitor);
}
