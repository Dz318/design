package com.demo.visitor;

import com.demo.element.BathRoom;
import com.demo.element.MonitoringRoom;
import com.demo.element.Store;

/**
 * @author dz
 * @version 1.0
 * @description 抽象访问者
 * @return
 * @exception
 * @createDate 2020-4-30 10:56
 **/
public interface Visitor {

    /**
    * 进入卫生间
    * @author      dz
    * @date        2020-4-30 11:00
    **/
    void visitBathRoom(BathRoom bathRoom);

    /**
    *  进入商场
    * @author      dz
    * @date        2020-4-30 10:59
    **/
    void vistiStore(Store store);

    /**
    * 进入监控室
    * @author      dz
    * @date        2020-4-30 10:58
    **/
    void visitMonitoringRoom(MonitoringRoom monitoringRoom);
}
