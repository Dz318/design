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

    /***
     * @description 用来保存注册过的观察者
     * @author      dz
     * @date        2020-7-16 14:13
     **/
    private List<Observer> observers = new ArrayList<>();

    /***
     * @description 注册观察者
     * @author      dz
     * @date        2020-7-16 14:13
     **/
    public void registerObserver(Observer observer){
        this.observers.add(observer);
    }

    /***
    * @description 移除观察者
    * @author      dz
    * @date        2020-7-16 14:13
    **/
    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    /***
     * @description 通知所有观察者进行状态更新
     * @author      dz
     * @date        2020-7-16 14:13
     **/
    public void notifyObservers(Subject subject){
        for (Observer o : observers) {
            o.update(subject);
        }
    }

}
