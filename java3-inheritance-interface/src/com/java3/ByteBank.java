package com.java3;

import com.java3.accounts.CurrentAccount;
import com.java3.accounts.SavingAccount;
import com.java3.people.BonusController;
import com.java3.people.Employee;
import com.java3.people.Manager;

public class ByteBank {
    public static void main(String[] args) {
//        createEmployers();
        CurrentAccount cc = new CurrentAccount(1010);
        SavingAccount sc = new SavingAccount(1010);

        cc.toDeposit(2000);
        cc.toTransfer(1000, sc);

        System.out.println("Current Account has $" + cc.getBalance());
        System.out.println("Saving Account has $" + sc.getBalance());

    }

    private static void createEmployers() {
        Manager manager = new Manager();
        manager.setName("John");
        manager.setSalary(2300.00);

        Employee employee = new Employee();
        employee.setName("Paul");
        employee.setSalary(1050.00);

        BonusController controller = new BonusController();

        controller.addEmployee(manager);
        controller.addEmployee(employee);

        System.out.println("Total bonus: " + controller.getTotalBonus());
    }
}
