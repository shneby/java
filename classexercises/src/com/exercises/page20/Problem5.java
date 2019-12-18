package com.exercises.page20;

import com.exercises.tools.GenVal;

import java.util.stream.IntStream;

public class Problem5 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int year = v.genInt(1900, 2100);
        int month = v.genInt(1, 12);
        boolean isLeap = false;

        if(year % 4 == 0){
            if(year % 100 != 0){
                isLeap = true;
            } else {
                if(year % 400 == 0){
                    isLeap = true;
                }
            }
        }

        System.out.println("year: " + year);
        System.out.println("month: " + month);
        System.out.println("isLeap: " + isLeap);

        int[] months31 = {1, 3, 5, 7, 8, 10, 12};

        if(month == 2){
            if(isLeap){
                System.out.println("days: 29");
            } else {
                System.out.println("days: 28");
            }
        } else if(IntStream.of(months31).anyMatch(x -> x == month)){  // single line iteration over array
            System.out.println("days: 31");
        } else {
            System.out.println("days: 30");
        }
    }
}
