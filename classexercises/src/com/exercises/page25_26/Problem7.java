package com.exercises.page25_26;

import com.exercises.tools.GenVal;

public class Problem7 {
    public static void main(String[] args) {
        GenVal v = new GenVal();

        int n = v.genInt(-1, 10);
        System.out.println("Got new input: " + n);
        int highest = n;

        while(n > 0){
            if(n > highest) {
                highest = n;
            }
            n = v.genInt(-1, 10);
            System.out.println("Got new input: " + n);
        }

        if(highest > 0){
            System.out.printf("highest: %d%n", highest);
        } else {
            System.out.println("Could not find a positive value");
        }
    }
}
