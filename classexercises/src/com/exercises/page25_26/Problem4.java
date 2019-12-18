package com.exercises.page25_26;

import com.exercises.tools.GenVal;

public class Problem4 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int den = v.genInt(1, 10);
        int max = v.genInt(1, 100);
        int counter = 1;

        System.out.println("den: " + den);
        System.out.println("max: " + max);

        while(counter <= max){
            if(counter % den == 0){
                System.out.println(counter);
            }
            counter ++;
        }
    }
}
