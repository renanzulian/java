package com.java3.accounts;

public class TaxCalculator {

    private double totalTax;

    public void addTax(Taxable taxable) {
        this.totalTax += taxable.getTax();
    }

    public double getTotalTax() {
        return totalTax;
    }
}
