package com.exercisepdf.banksystem.model.exceptions;

public class AccountNotFoundException extends Exception {
    private Integer id;

    public AccountNotFoundException(Integer id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
