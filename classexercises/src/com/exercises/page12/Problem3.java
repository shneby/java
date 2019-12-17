package com.exercises.page12;

import com.exercises.tools.GenVal;

public class Problem3 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int a = v.genInt(0, 10);
        int b = v.genInt(0, 10);

        System.out.println(a);
        System.out.println(b);
    }
}
