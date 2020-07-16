package com.demo.test;

/**
 * @author dz
 * @version 1.0
 * @description 组长审批
 * @createDate 2020-7-16 14:47
 **/
public class GroupLeader implements Ratify {
    @Override
    public Result deal(Chain chain) {
        Request request = chain.request();
        System.out.println("GroupLeader ====>request:("+request.getName()+"-"+request.getReason()+"-"+request.getDays()+")");

        if (request.getDays() > 1){
            Request newRequest = new Request.Builder().newRequest(request).
                    setGroupLeaderInfo(request.getName() + " 平时表现不错，项目也不忙").build();
            return chain.Proceed(newRequest);
        }
        return new Result(true, "早去早回！");
    }
}
