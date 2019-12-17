package com.exercises.page15;

import com.exercises.tools.GenVal;

public class Problem9 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int a = v.genInt(10, 99);
        System.out.println("a: " + a);
        System.out.println(String.format("reversed: %s%s", (a % 10), (a / 10)));
    }
}