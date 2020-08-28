package com.java3.people;

import com.java3.people.Employee;

public class BonusController {

    private double totalBonus;

    public double getTotalBonus() {
        return totalBonus;
    }

    public void addEmployee(Employee employee) {
        this.totalBonus += employee.getBonus();
    }

}
