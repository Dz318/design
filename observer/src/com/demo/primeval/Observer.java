package com.demo.primeval;/***
 * Created by dz on 2020-5-6
 */

/**
 * @author dz
 * @version 1.0
 * @description
 * @createDate 2020-5-6 15:55
 **/
public interface Observer {

    /**
    * 更新观察者状态
    * @author      dz
    * @date        2020-5-6 15:56
    */
    public void update(Subject subject);
}
