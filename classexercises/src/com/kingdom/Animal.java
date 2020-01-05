package com.kingdom;

public class Animal {

    private String type = this.getClass().getSimpleName();

    public void communicate(){
        System.out.printf("The %s says: ", this.type);
    }
}
