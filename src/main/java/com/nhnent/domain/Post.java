package com.nhnent.domain;

import java.util.Date;

public class Post {
    private int id;
    private String email;
    private String password;
    private String content;
    private String beautifulDate;
    private Date registeredDate;
    private Date modifiedDate;

    public Post() {}

    public Post(String email, String password, String content) {
        this.email = email;
        this.password = password;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getBeautifulDate() {
        return beautifulDate;
    }

    public void setBeautifulDate(String beautifulDate) {
        this.beautifulDate = beautifulDate;
    }

    @Override
    public String toString() {
        return "id : " + id + ", email: " + email + ", password: " + password +
                ", content: " + content + ", registeredDate: " + registeredDate +
                ", modifiedDate: " + modifiedDate + ", beautifulDate: " + beautifulDate;
    }
}
