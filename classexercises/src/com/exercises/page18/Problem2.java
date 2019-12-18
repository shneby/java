package com.exercises.page18;

import com.exercises.tools.GenVal;

public class Problem2 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int a = v.genInt(-10, 10);
        int b = v.genInt(-10, 10);
        int c = v.genInt(-10, 10);

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        if(a < b){
            if(b < c){
                System.out.println("Increasing...");
            }
        }
    }
}
