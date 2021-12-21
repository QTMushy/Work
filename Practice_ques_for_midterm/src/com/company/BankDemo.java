package com.company;

import java.util.ArrayList;

public class BankDemo {
    public static void bank_test()
    {
        ArrayList<Bank> ob = new ArrayList<>();
        ob.add(new Bank());
        System.out.println(ob.get(0).getAccountNumber());

        /*Bank[] account = new Bank[3];
        for (int i=0;i< account.length;i++)
        {
            account[i] = new Bank();
        }*/
    }
    public static void main(String[] args) {
        bank_test();

    }
}
