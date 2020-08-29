package com.java3.people;

import com.java3.people.Employee;

public class Manager extends TrustPosition {

    @Override
    public double getBonus() {
        return super.getSalary();
    }
}
