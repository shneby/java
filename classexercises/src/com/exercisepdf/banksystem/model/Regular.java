package com.exercisepdf.banksystem.model;

public class Regular extends Client{
    public Regular(Integer id, String name, Float balance) {
        super(id, name, balance, 0.03f, 0.001f);
    }

    @Override
    public String toString() {
        return String.format("Regular - %d", this.getId());
    }
}
