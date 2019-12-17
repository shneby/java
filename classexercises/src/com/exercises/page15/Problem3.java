package com.exercises.page15;

import com.exercises.tools.GenVal;

public class Problem3 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int diameter = v.genInt(1, 10);
        int depth = v.genInt(1, 10);
        float radius = diameter/2f;
        float pie = 3.14f;
        double circleArea = pie * Math.pow(radius, 2);
        double potCapacity = circleArea * depth;

        System.out.println("diameter: " + diameter);
        System.out.println("depth: " + depth);
        System.out.println("radius: " + radius);
        System.out.println("circleArea: " + circleArea);
        System.out.println("potCapacity: " + potCapacity);
    }
}