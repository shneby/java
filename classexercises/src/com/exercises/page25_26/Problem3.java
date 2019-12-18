package com.exercises.page25_26;

import com.exercises.tools.GenVal;

public class Problem3 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int n = v.genInt(1, 100);
        int counter = 0;

        System.out.println("n: " + n);
        while(counter <= n){
            if(counter % 2 == 0){
                System.out.println(counter);
            }
            counter ++;
        }
    }
}
