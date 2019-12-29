package com.random;

public class SingletonMain {

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.countAccess();
        Singleton z = Singleton.getInstance();
        z.countAccess();
    }
}
