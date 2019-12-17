package com.exercises.page12;

import com.exercises.tools.GenVal;

public class Problem7 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int a = v.genInt(0, 10);

        for(int i = 0; i<3; i++){
            System.out.println(a);
        }
    }
}
