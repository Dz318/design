package com.demo.primeval;/***
 * Created by dz on 2020-5-6
 */

/**
 * @author dz
 * @version 1.0
 * @description
 * @createDate 2020-5-6 16:00
 **/
public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("被观察者自身状态更新为:"+ this.state);

        // 状态发生改变 通知所有观察者
        this.notifyObservers(this);
    }
}
