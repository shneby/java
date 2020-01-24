package com.pdfexercises.ex5;

public class RandCompareEvenOdd {
    private int rand1;

    public RandCompareEvenOdd() {
        this.rand1 = (int)(Math.random()*101);
    }

    public void compare(){
        if(rand1 <= 50){
            System.out.println("Small !");
        } else {
            System.out.println("Big !");
        }

        if(rand1 % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        RandCompareEvenOdd randCompareEvenOdd = new RandCompareEvenOdd();
        randCompareEvenOdd.compare();
    }
}
