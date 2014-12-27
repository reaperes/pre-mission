package com.nhnent.domain;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UploadPost {
    @NotNull
    @Size(max=64)
    @Email
    private String email;

    @NotNull
    @Size(max=18)
    private String password;

    @NotNull
    @Size(min=0, max=1000)
    private String content;

    public Post toPost() {
        return new Post(email, password, content);
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

    @Override
    public String toString() {
        return "email: " + email + ", password: " + password + ", content: " + content;
    }
}
