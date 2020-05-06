package com.demo.test;/***
 * Created by dz on 2020-4-30
 */

import com.demo.element.BathRoom;
import com.demo.element.MonitoringRoom;
import com.demo.element.Store;
import com.demo.structure.SuperMarket;
import com.demo.visitor.Customer;
import com.demo.visitor.StaffMember;
import com.demo.visitor.Visitor;

/**
 * @author dz
 * @version 1.0
 * @description 测试访问者模式
 * @createDate 2020-4-30 11:21
 **/
public class Test {
    public static void main(String[] args) {
        SuperMarket marketStructure = new SuperMarket();
        marketStructure.addPlace(new BathRoom());
        marketStructure.addPlace(new Store());
        marketStructure.addPlace(new MonitoringRoom());

        // 顾客访问
        Visitor customer = new Customer();
        System.err.println("=======顾客来到商场=======");
        marketStructure.handleRequest(customer);
        System.err.println("=======顾客离开商场=======");
        // 工作人员访问
        Visitor staffMember = new StaffMember();
        System.err.println("=======工作人员来到商场=======");
        marketStructure.handleRequest(staffMember);
        System.err.println("=======工作人员离开商场=======");
    }
}
