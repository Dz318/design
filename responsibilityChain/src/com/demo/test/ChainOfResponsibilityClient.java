package com.demo.test;

import java.util.ArrayList;

/**
 * @author dz
 * @version 1.0
 * @description 责任链模式工具类
 * @createDate 2020-7-16 15:03
 **/
public class ChainOfResponsibilityClient {
    private ArrayList<Ratify> ratifyArrayList;

    /***
    * @description
    * @param ratify :添加自定义的责任人
    * @author      dz
    * @date        2020-7-16 15:05
    **/
    public void addRatifys(Ratify ratify){
        ratifyArrayList.add(ratify);
    }


    public ChainOfResponsibilityClient() {
        this.ratifyArrayList = new ArrayList<>();
    }

    public Result execute(Request request){
        ArrayList<Ratify> ratifies = new ArrayList<>();
        ratifies.addAll(ratifyArrayList);
        ratifies.add(new GroupLeader());
        ratifies.add(new Manager());
        ratifies.add(new DepartmentHeader());
        RealChain realChain = new RealChain(request, ratifies, 0);
        return realChain.Proceed(request);
    }
}
