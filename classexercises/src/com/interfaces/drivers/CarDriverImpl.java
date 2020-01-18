package com.interfaces.drivers;

public class CarDriverImpl extends DriverImpl implements CarDriver {

    @Override
    public void giveARide() {
        super.drive();
        System.out.println("Where do you want to go mate?");
    }
}
