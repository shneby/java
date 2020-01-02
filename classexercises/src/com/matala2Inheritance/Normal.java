package com.matala2Inheritance;

import com.matala1.Account;

public class Normal extends Account {
    public Normal(String number, String customer) {
        super(number, customer);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount * 1.01);
    }
}
