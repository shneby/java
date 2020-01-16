package com.exercisepdf.banksystem.model.clientexceptions;

public class AccountNotFoundException extends Exception {
    private int id;

    public AccountNotFoundException(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
