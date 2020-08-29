package com.java3.people;

public interface FinancialAccess {

    String getPassword();

    void setPassword(String password);

    boolean toAuthenticate(String password);
}
