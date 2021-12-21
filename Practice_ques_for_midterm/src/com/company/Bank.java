package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Bank {
    private int accountNumber;
    private String name;
    Scanner keyboard = new Scanner(System.in);
    public Bank()
    {
        System.out.println("Enter Account Holder Name:");
        String name = keyboard.nextLine();
        System.out.println("Enter Account Number:");
        int account = keyboard.nextInt();
        this.setAccountNumber(account);
        this.setName(name);

    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }
}
