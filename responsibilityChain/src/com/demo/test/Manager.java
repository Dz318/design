package com.demo.test;/***
 * Created by dz on 2020-7-16
 */

/**
 * @author dz
 * @version 1.0
 * @description 部门经理审批
 * @createDate 2020-7-16 14:55
 **/
public class Manager implements Ratify {
    @Override
    public Result deal(Chain chain) {
        Request request = chain.request();
        System.out.println("Manager ====>request:("+request.getName()+"-"+request.getReason()+"-"+request.getDays()+")");

        if (request.getDays() > 3){
            Request newRequest = new Request.Builder().newRequest(request).
                    setManagerInfo(request.getName() + " 每月KPI考核还不错，可以批准").build();
            return chain.Proceed(newRequest);
        }
        return new Result(true, "早点把事情办完，项目离不开你！");
    }
}
