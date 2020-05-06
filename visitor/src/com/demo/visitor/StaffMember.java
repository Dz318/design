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
 * @createDate 2020-4-30 11:01
 **/
public class StaffMember implements Visitor{

    @Override
    public void visitBathRoom(BathRoom bathRoom) {
        System.out.println("/*工作人员来到卫生间");
        bathRoom.washing();
        System.out.println();
    }

    @Override
    public void vistiStore(Store store) {
        System.out.println("/*工作人员来到商场");
        System.out.println("现在是工作时间，请专心工作");
        System.out.println();
    }

    @Override
    public void visitMonitoringRoom(MonitoringRoom monitoringRoom) {
        System.out.println("/*工作人员来到监控室");
        monitoringRoom.watching();
        System.out.println();
    }
}
