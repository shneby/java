package com.threads.exc1;

public class MyNumberApp {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber();
        MyNumberThread myNumberThread1 = new MyNumberThread(myNumber);
        MyNumberThread myNumberThread2 = new MyNumberThread(myNumber);
        Thread thread1 = new Thread(myNumberThread1, "Thread1");
        Thread thread2 = new Thread(myNumberThread2, "Thread2");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(myNumber);
    }
}
