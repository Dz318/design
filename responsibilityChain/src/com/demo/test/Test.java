package com.demo.test;

/**
 * @author dz
 * @version 1.0
 * @description
 * @createDate 2020-7-2 14:36
 **/
public class Test {
    public static void main(String[] args) {
        Request request = new Request.Builder().setName("张三").setDays(5).setReason("事假").build();

        ChainOfResponsibilityClient client = new ChainOfResponsibilityClient();
        client.addRatifys(new CustomInterceptor());
        Result result = client.execute(request);
        System.out.println("结果:"+ result);
    }
}
