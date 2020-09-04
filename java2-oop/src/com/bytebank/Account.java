package com.bytebank;

public class Account {
    static int numberCounter = 1000;
    static final int agencyCounter = 100;

    private int number;
    private int agency;
    private double balance;
    private String headline;

    private Account () {
        this.number = Account.numberCounter++;
        this.agency = Account.agencyCounter;
        this.setBalance(0);
    }

    public Account(String headline) {
        this();
        this.headline = headline;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public int getAgency() {
        return agency;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public void addValue(double value) {
        this.balance += value;
    }

    public String getHeadline() {
        return headline;
    }

    private void setHeadline(String headline) {
        this.headline = headline;
    }
}
