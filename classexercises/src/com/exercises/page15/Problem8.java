package com.exercises.page15;

import com.exercises.tools.GenVal;

public class Problem8 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int a = v.genInt(10, 99);
        int sum = (a / 10) + (a % 10);

        System.out.println("a: " + a);
        System.out.println("sum: " + sum);
    }
}
