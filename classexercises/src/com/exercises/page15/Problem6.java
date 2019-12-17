package com.exercises.page15;

import com.exercises.tools.GenVal;

public class Problem6 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int a = v.genInt(1000, 100000);

        int secondRightDigit = (a % 100) / 10;

        System.out.println("a: " + a);
        System.out.println("secondRightDigit: " + secondRightDigit);
    }
}
