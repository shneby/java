package com.exercises.page17;

import com.exercises.tools.GenVal;

public class Problem2 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int a = v.genInt(0, 10);
        int b = v.genInt(0, 10);

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        if(a > b){
            System.out.println("largest: " + a);
        } else {
            System.out.println("largest: " + b);
        }
    }
}
