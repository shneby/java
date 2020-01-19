package com.exercisepdf.banksystem.model.exceptions;

public class AccountAlreadyAddedException extends Exception{
    private int id;

    public AccountAlreadyAddedException(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
