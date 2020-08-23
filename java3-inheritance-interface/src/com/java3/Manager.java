package com.java3;

public class Manager extends Employee {

    private String password;

    public boolean toAuthenticate(String password) {
        return this.password.equals(password);
    }

    @Override
    public double getBonus() {
        return getSalary() * 2;
    }
}
