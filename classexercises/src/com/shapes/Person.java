package com.shapes;

public class Person implements WithName {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
