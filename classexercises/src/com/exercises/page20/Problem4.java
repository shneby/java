package com.exercises.page20;

import com.exercises.tools.GenVal;

public class Problem4 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int year = v.genInt(1900, 2100);

        if(year % 4 == 0){
            if(year % 100 != 0){
                System.out.printf("%d is a leap year", year);
            } else {
                if(year % 400 == 0){
                    System.out.printf("%d is a leap year", year);
                }
            }
        } else {
            System.out.printf("%d is not a leap year", year);
        }
    }
}
