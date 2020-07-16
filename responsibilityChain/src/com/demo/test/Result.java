package com.demo.test;/***
 * Created by dz on 2020-7-16
 */

/**
 * @author dz
 * @version 1.0
 * @description 结果类
 * @createDate 2020-7-16 14:31
 **/
public class Result {

    private boolean isRatify;

    private String opinion;

    public Result(boolean isRatify, String opinion) {
        this.isRatify = isRatify;
        this.opinion = opinion;
    }

    @Override
    public String toString() {
        return "Result{" +
                "isRatify='" + isRatify + '\'' +
                ", opinion='" + opinion + '\'' +
                '}';
    }

    public boolean getIsRatify() {
        return isRatify;
    }

    public void setIsRatify(boolean isRatify) {
        this.isRatify = isRatify;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
}
