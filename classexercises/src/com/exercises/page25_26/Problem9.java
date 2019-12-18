package com.exercises.page25_26;

import com.exercises.tools.GenVal;

public class Problem9 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int n = v.genInt(0, 10000);
        int counter = 1;
        int highest = n;
        int highest_index = counter;

        System.out.printf("Got new input: %d in index %d%n", n, counter);
        while(counter <= 100){
            n = v.genInt(0, 10000);
            System.out.printf("Got new input: %d in index %d%n", n, counter);
            if(n > highest){
                highest = n;
                highest_index = counter;
            }
            counter ++;
        }
        System.out.printf("Highest %d at index %d%n",highest, highest_index);
    }
}
