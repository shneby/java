package com.matala2;

import com.matala1.Account;

public class Normal extends Account {
    public Normal(String number, String customer) {
        super(number, customer);
    }

    @Override
    public void adjustBalance(double amount) {
        super.adjustBalance((amount > 0) ? amount + amount * 0.01 : amount);
    }
}
