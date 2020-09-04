package com.java3.people;

public abstract class TrustPosition extends Employee {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean toAuthenticate(String password) {
        return this.password.equals(password);
    }

}
