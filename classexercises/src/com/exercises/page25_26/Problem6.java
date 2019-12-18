package com.exercises.page25_26;

import com.exercises.tools.GenVal;

public class Problem6 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        float sum = 0;
        int counter = 0;
        float avg = 0;

        int n = v.genInt(0, 10);
        System.out.println("Got new input: " + n);
        while(n != 0){
            sum += n;
            counter ++;
            n = v.genInt(0, 10);
            System.out.println("Got new input: " + n);
        }
        if(counter != 0){
            avg = sum / counter;
        }

        System.out.println("sum: " + sum);
        System.out.println("counter: " + counter);
        System.out.println("avg: " + avg);
    }
}
