package com.java3.people;

public interface FinancialAccess {

    void setPassword(String password);

    boolean toAuthenticate(String password);
}
