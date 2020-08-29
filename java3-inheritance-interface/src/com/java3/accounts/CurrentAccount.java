package com.java3.accounts;

public class CurrentAccount extends Account implements Taxable {

    private final double withdrawCost = 0.80;

    public CurrentAccount(int agency) {
        super(agency);
    }

    @Override
    public double withdraw(double value) {
        double totalValue = value + this.withdrawCost;
        double withdrawMoney = super.withdraw(totalValue);
        if (withdrawMoney > 0) {
            return withdrawMoney - this.withdrawCost;
        }
        return withdrawMoney;
    }

    @Override
    public double getTax() {
        return super.getBalance() * 0.05;
    }
}
