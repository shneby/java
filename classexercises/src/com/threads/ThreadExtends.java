package com.threads;

public class ThreadExtends extends Thread {

    public ThreadExtends(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " Hello!");
        for(int i=0; i<5; i++){
            System.out.println(getName() + ": " +i);
            try{
                sleep((long)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " Done!");
    }
}
