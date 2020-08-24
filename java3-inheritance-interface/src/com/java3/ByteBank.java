package com.java3;

public class ByteBank {
    public static void main(String[] args) {
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
