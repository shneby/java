package com.exercisepdf.banksystem.model;

public class Platinum extends Client {
    public Platinum(Integer id, String name, Float balance) {
        super(id, name, balance, 0.01f, 0.005f);
    }

    @Override
    public String toString() {
        return String.format("Platinum - %d", this.getId());
    }
}
