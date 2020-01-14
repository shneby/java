package com.random;

public class Singleton {
    private static Singleton instance;
    private int access = 0;

    private Singleton() {}

    public static Singleton getInstance(){
        if(instance == null){
            System.out.println("Generating singleton instance");
            instance = new Singleton();
        }
        return instance;
    }

    protected void countAccess(){
        access ++;
        System.out.printf("Singleton has been accessed %d times%n", access);
    }
}
