package com.exercisepdf.banksystem.model.exceptions;

public class ClientNotFoundException extends Exception {
    private Integer id;

    public ClientNotFoundException(Integer id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
