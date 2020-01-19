package com.exercisepdf.banksystem.exceptions;

public class ClientAlreadyExistsException extends Exception{
    private int id;

    public ClientAlreadyExistsException(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
