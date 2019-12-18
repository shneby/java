package com.exercises.page17;

import com.exercises.tools.GenVal;

public class Problem5 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int a = v.genInt(0, 10);
        int b = v.genInt(0, 10);

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        int min = (a > b) ? b : a;
        int max = (b > a) ? b : a;

        System.out.println(String.format("min: %d, max: %d", min, max));
    }
}
