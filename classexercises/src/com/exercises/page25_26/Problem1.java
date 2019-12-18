package com.exercises.page25_26;

import com.exercises.tools.GenVal;

public class Problem1 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int top = v.genInt(1, 100);
        int counter = 1;

        System.out.println("top: " + top);

        while(counter <= top){
            System.out.println(counter);
            counter ++;
        }
    }
}
