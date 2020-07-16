package com.demo.test;/***
 * Created by dz on 2020-7-16
 */

/**
 * @author dz
 * @version 1.0
 * @description 请求类
 * @createDate 2020-7-16 14:22
 **/
public class Request {
    private String name;

    private String reason;

    private int days;

    private String groupLeaderInfo;

    private String managerInfo;

    private String departmentHeaderInfo;

    private String customInfo;

    public Request(Builder builder){
        super();
        this.name = builder.name;
        this.reason = builder.reason;
        this.days = builder.days;
        this.groupLeaderInfo = builder.groupLeaderInfo;
        this.managerInfo = builder.managerInfo;
        this.departmentHeaderInfo = builder.departmentHeaderInfo;
        this.customInfo = builder.customInfo;
    }

    public String getName() {
        return name;
    }

    public String getReason() {
        return reason;
    }

    public int getDays() {
        return days;
    }

    public String getGroupLeaderInfo() {
        return groupLeaderInfo;
    }

    public String getManagerInfo() {
        return managerInfo;
    }

    public String getDepartmentHeaderInfo() {
        return departmentHeaderInfo;
    }

    public String getCustomInfo() {
        return customInfo;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                ", reason='" + reason + '\'' +
                ", days='" + days + '\'' +
                ", groupLeaderInfo='" + groupLeaderInfo + '\'' +
                ", managerInfo='" + managerInfo + '\'' +
                ", departmentHeaderInfo='" + departmentHeaderInfo + '\'' +
                ", customInfo='" + customInfo + '\'' +
                '}';
    }

    public static class Builder{
        private String name;

        private String reason;

        private int days;

        private String groupLeaderInfo;

        private String managerInfo;

        private String departmentHeaderInfo;

        private String customInfo;

        public Builder(){

        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = reason;
            return this;
        }

        public Builder setDays(int days) {
            this.days = days;
            return this;
        }


        public Builder setGroupLeaderInfo(String groupLeaderInfo) {
            this.groupLeaderInfo = groupLeaderInfo;
            return this;
        }


        public Builder setManagerInfo(String managerInfo) {
            this.managerInfo = managerInfo;
            return this;
        }

        public Builder setDepartmentHeaderInfo(String departmentHeaderInfo) {
            this.departmentHeaderInfo = departmentHeaderInfo;
            return this;
        }
        public Builder setCustomInfo(String customInfo) {
            this.customInfo = customInfo;
            return this;
        }
        public Builder newRequest(Request request) {
            this.name = request.name;
            this.days = request.days;
            this.reason = request.reason;

            if (request.groupLeaderInfo != null
                    && !request.groupLeaderInfo.equals("")) {
                this.groupLeaderInfo = request.groupLeaderInfo;
            }

            if (request.managerInfo != null && !request.managerInfo.equals("")) {
                this.managerInfo = request.managerInfo;
            }

            if (request.departmentHeaderInfo != null
                    && !request.departmentHeaderInfo.equals("")) {
                this.departmentHeaderInfo = request.departmentHeaderInfo;
            }

            if (request.customInfo != null && !request.customInfo.equals("")) {
                this.customInfo = request.customInfo;
            }
            return this;
        }
        public Request build(){
            return new Request(this);
        }
    }
}
