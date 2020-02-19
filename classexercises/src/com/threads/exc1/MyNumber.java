package com.threads.exc1;

public class MyNumber {
    private int i = 0;

    public int getI() {
        return i;
    }

    public void add(){
        synchronized (this){
            i++;
        }
    }

    @Override
    public String toString() {
        return "MyNumber{" +
                "i=" + i +
                '}';
    }
}
