package com.exercises.page20;

import com.exercises.tools.GenVal;

public class Problem1 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int a = v.genInt(0,10);
        int b = v.genInt(0,10);
        int c = v.genInt(0,10);

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        if(a < b){
            if(a < c){
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b < c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}
