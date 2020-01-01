package com.matala2Inheritance;

import com.matala1.Account;

public class Priority extends Account {
    public Priority(String number, String customer) {
        super(number, customer);
    }

    @Override
    public void adjustBalance(double amount) {
        super.adjustBalance((amount > 0) ? amount + amount * 0.032 : amount);
    }
}
