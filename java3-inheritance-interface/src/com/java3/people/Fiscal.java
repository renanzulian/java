package com.java3.people;

public class Fiscal implements FinancialAccess {

    private String password;

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean toAuthenticate(String password) {
        return this.password.equals(password);
    }
}
