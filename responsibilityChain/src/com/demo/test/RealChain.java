package com.demo.test;/***
 * Created by dz on 2020-7-16
 */

import java.util.List;

/**
 * @author dz
 * @version 1.0
 * @description 实现包装请求和转发请求
 * @createDate 2020-7-16 14:37
 **/
public class RealChain implements Ratify.Chain {

    private Request request;

    private List<Ratify> ratifyList;

    private int index;


    /***
    * @description
    * @param request :请求对象
    * @param ratifyList :实现ratify接口的类集合
    * @param index :已经处理的责任人数量
    * @author      dz
    * @date        2020-7-16 14:44
    **/
    public RealChain(Request request, List<Ratify> ratifyList, int index) {
        this.request = request;
        this.ratifyList = ratifyList;
        this.index = index;
    }

    @Override
    public Request request() {
        return request;
    }

    @Override
    public Result Proceed(Request request) {
        Result proceed = null;
        if (ratifyList.size() > index){
            RealChain realChain = new RealChain(request, ratifyList, index + 1);
            Ratify ratify = ratifyList.get(index);
            proceed = ratify.deal(realChain);
        }

        return proceed;
    }
}
