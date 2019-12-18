package com.exercises.page18;

import com.exercises.tools.GenVal;

public class Problem4 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int a = v.genInt(1, 9999);
        int digitNum = 1;
        if(a/10 > 0){
            digitNum ++;
            if(a/100 > 0){
                digitNum ++;
                if(a/1000 > 0){
                    digitNum ++;
                }
            }
        }
        System.out.println("a: " + a);
        System.out.println("digitNum: " + digitNum);
    }
}
