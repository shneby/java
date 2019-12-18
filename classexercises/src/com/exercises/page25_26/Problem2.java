package com.exercises.page25_26;

import com.exercises.tools.GenVal;

public class Problem2 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int a = v.genInt(1, 100);
        int b = v.genInt(1, 100);
        int min;
        int max;

        if(a > b){
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        while(min <= max){
            System.out.println(min);
            min ++;
        }
    }
}
