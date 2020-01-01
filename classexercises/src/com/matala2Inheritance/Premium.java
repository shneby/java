package com.matala2Inheritance;

import com.matala1.Account;

public class Premium extends Account {
    public Premium(String number, String customer) {
        super(number, customer);
    }

    @Override
    public void adjustBalance(double amount) {
        super.adjustBalance((amount > 0) ? amount + amount * 0.05 : amount);
    }
}
