package com.java3.accounts;

public class LifeInsurance implements Taxable{
    @Override
    public double getTax() {
        return 100;
    }
}
