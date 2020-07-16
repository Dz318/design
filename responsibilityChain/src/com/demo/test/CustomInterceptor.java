package com.demo.test;/***
 * Created by dz on 2020-7-16
 */

/**
 * @author dz
 * @version 1.0
 * @description 自定义 "责任人"
 * @createDate 2020-7-16 15:19
 **/
public class CustomInterceptor implements Ratify{

    @Override
    public Result deal(Chain chain) {
        Request request = chain.request();
        System.out.println("customInterceptor ====> request:("+request.getName()+"-"+request.getReason()+"-"+request.getDays()+")");
        String reason = request.getReason();
        if ("事假".equals(reason)){
            Request newRequest = new Request.Builder().newRequest(request).
                    setCustomInfo(request.getName() + " 请的是事假，并且很着急，请领导重视一下").build();
            System.out.println("customInterceptor ==>转发请求");
            return chain.Proceed(newRequest);
        }
        return new Result(true,"同意");
    }
}
