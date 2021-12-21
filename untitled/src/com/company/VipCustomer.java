package com.company;

public class VipCustomer {
    private String name;
    private int credit_limit;
    private String email;

    public VipCustomer() {
        this("Default Name",0,"Default email");
    }

    public VipCustomer(String name, int credit_limit) {
       this(name,credit_limit,"Default Email");
    }

    public VipCustomer(String name, int credit_limit, String email) {
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public String getEmail() {
        return email;
    }
}
