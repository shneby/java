package com.exercises.page18;

import com.exercises.tools.GenVal;

public class Problem1 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int a = v.genInt(-10, 10);
        System.out.printf("%d is %s", a, (a < 0) ? "Negative" : (a > 0) ? "Positive" : "Zero");
    }
}
