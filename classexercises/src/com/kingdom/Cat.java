package com.kingdom;

public class Cat extends Mammal {

    @Override
    public void communicate() {
        super.communicate();
        System.out.println("Meow...");
    }
}
