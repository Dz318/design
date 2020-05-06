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
 * @createDate 2020-4-30 11:08
 **/
public class MonitoringRoom extends Place {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitMonitoringRoom(this);
    }

    public void watching(){
        System.out.println("查看监控录像*/");
    }
}
