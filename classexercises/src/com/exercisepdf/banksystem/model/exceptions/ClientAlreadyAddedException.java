package com.exercisepdf.banksystem.model.exceptions;

public class ClientAlreadyAddedException extends Exception{
    private int id;

    public ClientAlreadyAddedException(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
