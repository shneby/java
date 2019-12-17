package com.exercises.page15;

import com.exercises.tools.GenVal;

public class Problem1 {
    public static void main(String[] args) {
        GenVal v = new GenVal();

        int a = v.genInt(0, 10);
        int b = v.genInt(0, 10);
        int c = v.genInt(0, 10);

        int sum = a + b +c;
        float avg = sum / 3f;

        System.out.println(sum);
        System.out.println(avg);
    }
}
