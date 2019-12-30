package com.matala1;

public class AccountDemo {
    public static void main(String[] args) {
        Account a = new Account("Az123", "omri");
        a.setName("Omri's account");

        System.out.println("Adding 1 credit to account:");
        a.adjustBalance(1);
        a.describe();

        System.out.println("Removing 1 credit from account:");
        a.adjustBalance(-1);
        a.describe();

        System.out.println("Removing 100 credits from account:");
        a.adjustBalance(-100);
        a.describe();

    }
}
