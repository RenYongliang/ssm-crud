package com.ryl.crud.dao.bean;

import java.math.BigDecimal;

public class Bank {

    private int id;
    private String username;
    private BigDecimal account;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BigDecimal getAccount() {
        return account;
    }

    public void setAccount(BigDecimal account) {
        this.account = account;
    }
}
