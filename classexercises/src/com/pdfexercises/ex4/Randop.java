package com.pdfexercises.ex4;


public class Randop {
    private int rand1;
    private int rand2;

    public Randop() {
        this.rand1 = (int)(Math.random()*101);
        this.rand2 = (int)(Math.random()*101);
    }

    public int getRand1() {
        return rand1;
    }

    public int getRand2() {
        return rand2;
    }

    public int getSum(){
        return rand1 + rand2;
    }

    public double getAvg(){
        return (double)(rand1 + rand2)/2;
    }

    public int getRectArea(){
        return rand1 * rand2;
    }

    @Override
    public String toString(){
        String print = "";
        print += "rand1: " + this.rand1 + "\n";
        print += "rand2: " + this.rand2 + "\n";
        print += "Sum: " + this.getSum() + "\n";
        print += "Avg: " + this.getAvg() + "\n";
        print += "RectArea: " + this.getRectArea() + "\n";
        return print;
    }

    public static void main(String[] args) {
        Randop randop = new Randop();
        System.out.println(randop);
    }
}
