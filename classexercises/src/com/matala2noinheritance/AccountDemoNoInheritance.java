package com.matala2noinheritance;

public class AccountDemoNoInheritance {
    public static void main(String[] args) {
        AccountNoInheritance acc1 = new AccountNoInheritance("Nor001", "Omri", "normal");
        AccountNoInheritance acc2 = new AccountNoInheritance("Pri001", "Omri", "priority");
        AccountNoInheritance acc3 = new AccountNoInheritance("Pre001", "Omri", "premium");

        acc1.setName("Omri's normal account");
        acc2.setName("Omri's priority account");
        acc3.setName("Omri's premium account");

        acc1.adjustBalance(100);
        acc2.adjustBalance(100);
        acc3.adjustBalance(100);

        acc1.describe();
        acc2.describe();
        acc3.describe();
    }
}
