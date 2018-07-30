package com.dubbo.server.entity;


import java.io.Serializable;

/**
 * @author Mr.C
 * @Description
 * @create 2018/7/26 9:42
 * Copyright: Copyright (c) 2018
 * Company:CWWT
 */
public class UserInfo implements Serializable {




    private  String id;
    private String userId;
    private String userName;
    private String password;
    private String sex;
    private Integer age;
    private Long phoneNo;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":\"")
                .append(id).append('\"');
        sb.append(",\"userId\":\"")
                .append(userId).append('\"');
        sb.append(",\"userName\":\"")
                .append(userName).append('\"');
        sb.append(",\"password\":\"")
                .append(password).append('\"');
        sb.append(",\"sex\":")
                .append(sex);
        sb.append(",\"age\":")
                .append(age);
        sb.append(",\"phoneNo\":")
                .append(phoneNo);
        sb.append('}');
        return sb.toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }
}
