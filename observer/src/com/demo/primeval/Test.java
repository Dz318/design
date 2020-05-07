package com.demo.primeval;/***
 * Created by dz on 2020-5-6
 */

/**
 * @author dz
 * @version 1.0
 * @description
 * @createDate 2020-5-6 16:04
 **/
public class Test {
    public static void main(String[] args) {
        // 创建被观察者对象
        ConcreteSubject subject = new ConcreteSubject();

        // 创建观察者对象
        ConcreteObserverA concreteObserverA = new ConcreteObserverA();
        ConcreteObserverB concreteObserverB= new ConcreteObserverB();

        // 为被观察者对象注册观察者
        subject.registerObserver(concreteObserverA);
        subject.registerObserver(concreteObserverB);

        subject.setState("复活中...");
        System.out.println();
        System.out.println("=============一百年之后...===============");
        System.out.println();
        subject.setState("疯狂杀戮中...");
    }
}
