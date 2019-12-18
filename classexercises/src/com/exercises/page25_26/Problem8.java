package com.exercises.page25_26;

import com.exercises.tools.GenVal;

public class Problem8 {
    public static void main(String[] args) {
        GenVal v = new GenVal();

        int n = v.genInt(-1, 10);
        System.out.println("Got new input: " + n);
        int lowest = n;

        while(n > 0){
            if(n < lowest) {
                lowest = n;
            }
            n = v.genInt(-1, 10);
            System.out.println("Got new input: " + n);
        }

        if(lowest > 0){
            System.out.printf("lowest: %d%n", lowest);
        } else {
            System.out.println("Could not find a positive value");
        }
    }
}