package com.demo.primeval;/***
 * Created by dz on 2020-5-6
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author dz
 * @version 1.0
 * @description 抽象被观察者（Subject）角色
 * @createDate 2020-5-6 15:55
 **/
public abstract class Subject {

    // 用来保存注册过的观察者
    private List<Observer> observers = new ArrayList<>();

    // 注册一个观察者
    public void registerObserver(Observer observer){
        this.observers.add(observer);
    }
    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    // 通知所有观察者进行状态更新
    public void  notifyObservers(Subject subject){
        for (Observer o : observers) {
            o.update(subject);
        }
    }

}
