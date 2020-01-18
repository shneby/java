package com.interfaces.drivers;

public class TruckDriverImpl extends DriverImpl implements TruckDriver {

    @Override
    public void transport() {
        super.drive();
        System.out.println("What are we moving today");
    }

}
