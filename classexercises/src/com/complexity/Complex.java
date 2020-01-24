package com.complexity;

import java.util.Date;

public class Complex {

    private int[] arr = new int[50000000];
    private int length = arr.length;

    public void loop(){
        long start =  System.nanoTime();
        for(int i=0; i<length; i++){
            int x = 1;
        }
        long finished = System.nanoTime();
        System.out.printf("Elasped: %s\n",  finished - start);
}

    public void noLoop(){
        long start =  System.nanoTime();
        int x = arr[length - 1];
        long finished = System.nanoTime();
        System.out.printf("Elasped: %s\n",  finished - start);

    }


    public static void main(String[] args) {

        Complex c = new Complex();
        c.loop();
        c.noLoop();

    }
}
