package com.atguigu.spring5.entity;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-02-27 22:01
 */
public class Book {
    private String userId;
    private String userName;
    private String ustatus;

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

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }
}
