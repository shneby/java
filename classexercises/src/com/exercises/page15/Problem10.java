package com.exercises.page15;

import com.exercises.tools.GenVal;

public class Problem10 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int a = v.genInt(0, 10);
        int next = (a % 2 == 0) ? a + 2 : a + 1;

        System.out.println("a: " + a);
        System.out.println("next: " + next);
    }
}