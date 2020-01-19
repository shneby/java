package com.exercisepdf.banksystem.model.exceptions;

public class ClientNotFoundException extends Exception {
    private int id;

    public ClientNotFoundException(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
