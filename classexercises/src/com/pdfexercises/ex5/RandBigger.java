package com.pdfexercises.ex5;

public class RandBigger {
    private int rand1;
    private int rand2;

    public RandBigger() {
        this.rand1 = (int)(Math.random()*101);
        this.rand2 = (int)(Math.random()*101);
    }

    public void getBigger(){
        int biggest = (rand1 > rand2) ? rand1 : rand2;
        System.out.println("rand1: " + rand1);
        System.out.println("rand2: " + rand2);
        System.out.println("biggest: " + biggest);
    }

    public static void main(String[] args) {
        RandBigger randBigger = new RandBigger();
        randBigger.getBigger();
    }
}
