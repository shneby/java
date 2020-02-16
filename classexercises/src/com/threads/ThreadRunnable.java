package com.threads;

public class ThreadRunnable implements Runnable{

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " Hello!");
        for(int i=0; i<5; i++){
            System.out.println(threadName + ": " +i);
            try{
                Thread.sleep((long)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadName + " Done!");
    }

}
