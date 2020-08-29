package com.java3.systems;

import com.java3.people.TrustPosition;

public class FinancialSystem {

    private final String systemPassword = "12345";

    public void toAccess(TrustPosition employee) {
        if(isAuthenticated(employee)) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }

    }

    private boolean isAuthenticated(TrustPosition employee) {
        return this.systemPassword.equals(employee.getPassword());
    }

}
