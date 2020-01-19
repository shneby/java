package com.interfaces.drivers;

public class DriverImpl implements Driver, Person {
    @Override
    public void drive() {
        System.out.println("Vrooommm...");
    }

    @Override
    public void leave() {
        System.out.println("Fuck it! I'm out!");
    }
}
