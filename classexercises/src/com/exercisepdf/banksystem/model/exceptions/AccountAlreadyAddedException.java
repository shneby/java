package com.exercisepdf.banksystem.model.exceptions;

public class AccountAlreadyAddedException extends Exception{
    private Integer id;

    public AccountAlreadyAddedException(Integer id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
