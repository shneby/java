package com.exercises.page17;

import com.exercises.tools.GenVal;

public class Problem4 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int a = v.genInt(0, 10);
        int b = v.genInt(0, 10);

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        if(b != 0 && a % b == 0){
            System.out.println(String.format("%d divides evenly by %d",a ,b));
        }
        if(a != 0 && b % a == 0){
            System.out.println(String.format("%d divides evenly by %d",b ,a));
        }
    }
}
