package com.exercises.page17;

import com.exercises.tools.GenVal;

public class Problem3 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int a = v.genInt(0, 10);
        String status = (a % 2 == 0) ? "Even" : "Odd";

        System.out.println(String.format("%d is %s", a, status));
    }
}
