package com.java3;

import com.java3.accounts.CurrentAccount;
import com.java3.accounts.SavingAccount;
import com.java3.people.*;
import com.java3.systems.FinancialSystem;

public class ByteBank {
    public static void main(String[] args) {
//        createEmployers();
//        createAccounts();

        FinancialSystem fSystem = new FinancialSystem();

        FinancialAccess manager = new Manager();
        manager.setPassword("12345");
        FinancialAccess accountant = new Accountant();
        accountant.setPassword("1234");
        FinancialAccess fiscal = new Fiscal();
        fiscal.setPassword("12345");

        fSystem.toAccess(manager);
        fSystem.toAccess(accountant);
        fSystem.toAccess(fiscal);

    }

    private static void createAccounts() {
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

        Employee employee = new Developer();
        employee.setName("Paul");
        employee.setSalary(1050.00);

        BonusController controller = new BonusController();

        controller.addEmployee(manager);
        controller.addEmployee(employee);

        System.out.println("Total bonus: " + controller.getTotalBonus());
    }
}
