package com.interfaces.drivers;

public class RaceDriverImpl extends CarDriverImpl implements RaceDriver {
    @Override
    public void giveARide() {
        super.giveARide();
        System.out.println("But really fast");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("But really fast");
    }
}
