package com.exercisepdf.banksystem.model;

import java.util.Objects;

public class Account {
    private int id;
    private float balance;

    public Account(int id, float balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
