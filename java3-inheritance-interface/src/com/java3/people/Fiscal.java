package com.java3.people;

import com.java3.systems.FinancialSystemAccess;

public class Fiscal implements FinancialAccess {

    FinancialSystemAccess access;

    public Fiscal() {
        access = new FinancialSystemAccess();
    }

    @Override
    public void setPassword(String password) {
        this.access.setPassword(password);
    }

    @Override
    public boolean toAuthenticate(String password) {
        return this.access.toAuthenticate(password);
    }
}
