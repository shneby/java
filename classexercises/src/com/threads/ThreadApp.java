package com.threads;

public class ThreadApp {
    public static void main(String[] args) {
        new Thread(new ThreadRunnable(), "ThreadRunnable-1").start();
        new Thread(new ThreadRunnable(), "ThreadRunnable-2").start();
        new Thread(new ThreadRunnable(), "ThreadRunnable-3").start();
        new Thread(new ThreadRunnable(), "ThreadRunnable-4").start();
        new ThreadExtends("ThreadExtend-1").start();
        new ThreadExtends("ThreadExtend-2").start();
        new ThreadExtends("ThreadExtend-3").start();
        new ThreadExtends("ThreadExtend-4").start();
    }
}
