package com.pdfexercises.ex5;

public class RandCompare {
    private int rand1;

    public RandCompare() {
        this.rand1 = (int)(Math.random()*101);
    }

    public void compareTo50(){
        if(rand1 > 50){
            System.out.println("Big !");
        } else if (rand1 == 50){
            System.out.println("Bingo !");
        } else {
            System.out.println("Small !");
        }
    }

    public static void main(String[] args) {
        RandCompare randCompare = new RandCompare();
        randCompare.compareTo50();
    }
}
