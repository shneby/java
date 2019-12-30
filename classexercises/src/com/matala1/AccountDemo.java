package com.matala1;

import com.matala2.Normal;
import com.matala2.Premium;
import com.matala2.Priority;

public class AccountDemo {
    public static void main(String[] args) {
        Account account = new Account("Bas001", "Omri");
        Account normal = new Normal("Nor001", "Omri");
        Account priority = new Priority("Pri001", "Omri");
        Account premium = new Premium("Pre001", "Omri");

        account.setName("Omri's base account");
        normal.setName("Omri's normal account");
        priority.setName("Omri's priority account");
        premium.setName("Omri's premium account");

        account.adjustBalance(100);
        normal.adjustBalance(100);
        priority.adjustBalance(100);
        premium.adjustBalance(100);

        account.describe();
        normal.describe();
        priority.describe();
        premium.describe();
    }
}
