package com.exercisepdf.banksystem.model;

public class Gold extends Client {
    public Gold(Integer id, String name, Float balance) {
        super(id, name, balance, 0.02f, 0.003f);
    }

    @Override
    public String toString() {
        return String.format("Gold - %d", this.getId());
    }
}
