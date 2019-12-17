package com.exercises.page15;

import com.exercises.tools.GenVal;

public class Problem2 {
    public static void main(String[] args) {
        GenVal v = new GenVal();

        int length = v.genInt(0, 10);
        int width = v.genInt(0, 10);

        int circumference = length * 2 + width * 2;
        int area = length * width;
        System.out.println("length: " + length);
        System.out.println("width: " + width);
        System.out.println("circumference: " + circumference);
        System.out.println("area: " + area);
    }
}