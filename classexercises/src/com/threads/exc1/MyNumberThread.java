package com.threads.exc1;

public class MyNumberThread implements Runnable {
    private MyNumber myNumber;
    private Boolean quit = false;

    public MyNumberThread(MyNumber myNumber) {
        this.myNumber = myNumber;
    }

    public void stopThread(){
        System.out.println("Stopping thread");
        quit = true;
    }

    @Override
    public void run() {
        int i = 0;
        while(!quit && i<1000){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.myNumber.add();
            System.out.println(Thread.currentThread().getName()+ ": " +this.myNumber.getI());
            i++;
        }
    }
}
