package com.java3;

public class Employee {

    protected String name;
    protected String cpf;
    protected double salary;

    public double getBonus() {
        return this.salary * 0.1;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
