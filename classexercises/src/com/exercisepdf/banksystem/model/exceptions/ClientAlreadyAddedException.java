package com.exercisepdf.banksystem.model.exceptions;

public class ClientAlreadyAddedException extends Exception{
    private Integer id;

    public ClientAlreadyAddedException(Integer id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
