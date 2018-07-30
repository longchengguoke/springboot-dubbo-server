package com.dubbo.server.entity;

import java.io.Serializable;

/**
 * @author Mr.C
 * @Description
 * @create 2018/7/26 10:29
 * Copyright: Copyright (c) 2018
 * Company:CWWT
 */
public class UserInfoVo implements Serializable{

    private String id;
    private String md5UserInfo;
    private Boolean enableUser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMd5UserInfo() {
        return md5UserInfo;
    }

    public void setMd5UserInfo(String md5UserInfo) {
        this.md5UserInfo = md5UserInfo;
    }

    public Boolean getEnableUser() {
        return enableUser;
    }

    public void setEnableUser(Boolean enableUser) {
        this.enableUser = enableUser;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":\"")
                .append(id).append('\"');
        sb.append(",\"md5UserInfo\":\"")
                .append(md5UserInfo).append('\"');
        sb.append(",\"enableUser\":")
                .append(enableUser);
        sb.append('}');
        return sb.toString();
    }
}
