package com.exercises.page15;

import com.exercises.tools.GenVal;

public class Problem7 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int a = v.genInt(100, 999);

        int hundredthDigit = a / 100;

        System.out.println("a: " + a);
        System.out.println("hundredthDigit: " + hundredthDigit);
    }
}
