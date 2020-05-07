package com.demo.primeval;/***
 * Created by dz on 2020-5-6
 */

/**
 * @author dz
 * @version 1.0
 * @description
 * @createDate 2020-5-6 16:02
 **/
public class ConcreteObserverA implements Observer {

    private ConcreteSubject concreteSubject;

    public ConcreteSubject getConcreteSubject() {
        return concreteSubject;
    }

    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void update(Subject subject) {
        this.concreteSubject = (ConcreteSubject) subject;
        System.out.println("观察者A中被观察对象的状态更新为:"+concreteSubject.getState());
    }
}
