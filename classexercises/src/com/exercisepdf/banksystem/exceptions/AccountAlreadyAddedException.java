package com.exercisepdf.banksystem.exceptions;

public class AccountAlreadyAddedException extends Exception{
    private int id;

    public AccountAlreadyAddedException(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
