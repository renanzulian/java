package com.java3;

public class BonusController {

    private double totalBonus;

    public double getTotalBonus() {
        return totalBonus;
    }

    public void addEmployee(Employee employee) {
        this.totalBonus += employee.getBonus();
    }

}
