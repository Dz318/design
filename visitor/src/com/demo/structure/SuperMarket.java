package com.demo.structure;/***
 * Created by dz on 2020-4-30
 */

import com.demo.element.Place;
import com.demo.visitor.Visitor;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author dz
 * @version 1.0
 * 结构对象，通常在这里对元素对象进行遍历，让访问者能够访问到所有的元素
 * @createDate 2020-4-30 11:16
 **/
public class SuperMarket  {
    /**
    * @description 示意,表示对象结构，可以是一个组合结构或者集合
    * @author      dz
    * @date        2020-4-30 11:22
    **/
    private Collection<Place> places = new ArrayList<>();

    public void handleRequest(Visitor visitor){
        places.forEach(item ->{
            item.accept(visitor);
        });
    }
    /**
    * 示意方法，组建对象结构，向对象结构中添加元素
    * @param    place 操作对象
    * @author      dz
    * @date        2020-4-30 11:21
    **/
    public void addPlace(Place place){
        places.add(place);
    }
}
