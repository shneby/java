package com.exercisepdf.banksystem.model.clientexceptions;

public class AccountAlreadyAddedException extends Exception{
    private int id;

    public AccountAlreadyAddedException(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
