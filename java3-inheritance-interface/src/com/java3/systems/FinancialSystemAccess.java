package com.java3.systems;

public class FinancialSystemAccess {

    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public boolean toAuthenticate(String password) {
        return this.password.equals(password);
    }
}
