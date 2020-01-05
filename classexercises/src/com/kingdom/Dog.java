package com.kingdom;

public class Dog extends Mammal{

    @Override
    public void communicate() {
        super.communicate();
        System.out.println("Bark I say!");
    }
}
