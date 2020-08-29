package com.java3.systems;

import com.java3.people.FinancialAccess;
import com.java3.people.TrustPosition;

public class FinancialSystem {

    private final String systemPassword = "12345";

    public void toAccess(FinancialAccess user) {
        if(isAuthenticated(user)) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }

    }

    private boolean isAuthenticated(FinancialAccess user) {
        return this.systemPassword.equals(user.getPassword());
    }

}
