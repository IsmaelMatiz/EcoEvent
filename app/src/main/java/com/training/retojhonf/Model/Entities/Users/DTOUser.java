package com.training.retojhonf.Model.Entities.Users;

public class DTOUser {
    private int userId;
    private String fullName;
    private String email;
    private String password;
    private String secQuestion1;
    private String ansQuestion1;
    private String secQuestion2;
    private String ansQuestion2;

    public DTOUser() {
    }

    public DTOUser(String fullName, String email, String password, String secQuestion1, String ansQuestion1, String secQuestion2, String ansQuestion2) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.secQuestion1 = secQuestion1;
        this.ansQuestion1 = ansQuestion1;
        this.secQuestion2 = secQuestion2;
        this.ansQuestion2 = ansQuestion2;
    }

    public DTOUser(int userId, String fullName, String email, String password, String secQuestion1, String ansQuestion1, String secQuestion2, String ansQuestion2) {
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.secQuestion1 = secQuestion1;
        this.ansQuestion1 = ansQuestion1;
        this.secQuestion2 = secQuestion2;
        this.ansQuestion2 = ansQuestion2;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getSecQuestion1() {
        return secQuestion1;
    }

    public void setSecQuestion1(String secQuestion1) {
        this.secQuestion1 = secQuestion1;
    }

    public String getAnsQuestion1() {
        return ansQuestion1;
    }

    public void setAnsQuestion1(String ansQuestion1) {
        this.ansQuestion1 = ansQuestion1;
    }

    public String getSecQuestion2() {
        return secQuestion2;
    }

    public void setSecQuestion2(String secQuestion2) {
        this.secQuestion2 = secQuestion2;
    }

    public String getAnsQuestion2() {
        return ansQuestion2;
    }

    public void setAnsQuestion2(String ansQuestion2) {
        this.ansQuestion2 = ansQuestion2;
    }
}
