package com.java3.accounts;

public class Account {
    private double balance;
    private int agency;
    private int id;
    private String owner;

    private static int totalAccounts;

    public Account(int agency) {
        Account.totalAccounts ++;
        this.agency = agency;
        this.id = 1000 + Account.totalAccounts;
        this.owner = "Undefined";
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public int getAgency() {
        return agency;
    }

    public int getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void toDeposit(double value) {
        this.balance += value;
    }

    public double withdraw(double value) {
        if(this.balance >= value) {
            this.balance -= value;
            return value;
        }
        return 0.0;
    }

}
