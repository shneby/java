package com.exercisepdf.banksystem.exceptions;

public class ClientNotFoundException extends Exception{
    private int id;

    public ClientNotFoundException(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
