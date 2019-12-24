package com.exercises.page48;

import com.exercises.tools.GenVal;

import java.util.Arrays;

public class Problem7 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        char[] arr = new char[10];

        String numbersArr = "0123456789";
        String charactersArr = "abcdefghijklnmopqrstuvwxyz";
        String specialArr = "~!@#$%^&*()_+=-";


        int numbers = 0;
        int characters = 0;
        int special = 0;

        // Populating the array
        for(int i=0; i<arr.length; i++){
            arr[i] = v.genCharRandom();
        }
        System.out.println(Arrays.toString(arr));

        // Accounting for character types in the array
        // System.out.println(Arrays.toString(arr));
    }
}
