package com.java3.people;

import com.java3.people.Employee;

public class Manager extends Employee {

    private String password;

    public boolean toAuthenticate(String password) {
        return this.password.equals(password);
    }

    @Override
    public double getBonus() {
        return super.getSalary();
    }
}
