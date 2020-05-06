package com.demo.visitor;/***
 * Created by dz on 2020-4-30
 */

import com.demo.element.BathRoom;
import com.demo.element.MonitoringRoom;
import com.demo.element.Store;

/**
 * @author dz
 * @version 1.0
 * @description
 * @return
 * @exception
 * @createDate 2020-4-30 11:14
 **/
public class Customer implements Visitor {
    @Override
    public void visitBathRoom(BathRoom bathRoom) {
        System.out.println("/*顾客来到卫生间");
        bathRoom.washing();
        System.out.println();
    }

    @Override
    public void vistiStore(Store store) {
        System.out.println("/*顾客来到商场");
        store.shopping();
        System.out.println();
    }

    @Override
    public void visitMonitoringRoom(MonitoringRoom monitoringRoom) {
        System.out.println("/*顾客来到卫生间");
        System.out.println("非工作人员不得入内");
        System.out.println();
    }
}
