package com.demo.test;

/**
 * @author dz
 * @version 1.0
 * @description 处理请求
 * @createDate 2020-7-16 14:32
 **/
public interface Ratify {

    /**
    * @description 处理请求
    * @param chain : 封装请求和结果对象，用于转发
     * @Return 处理结果
    * @author      dz
    * @date        2020-7-16 14:34
    **/
    Result deal(Chain chain);


    /**
     * @description 用于封装请求和结果对象，转发请求
     * @author      dz
     * @date        2020-7-16 14:34
     **/
    interface Chain{
        /**
         * @description 获取当前请求对象
         * @return 返回当前请求对象
         * @author      dz
         * @date        2020-7-16 14:35
         **/
        Request request();

        /**
        * @description 转发请求
        * @param request : 请求对象
        * @return 处理结果
        * @author      dz
        * @date        2020-7-16 14:35
        **/
        Result Proceed(Request request);
    }
}
