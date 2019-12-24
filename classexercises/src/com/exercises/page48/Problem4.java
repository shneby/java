package com.exercises.page48;

import com.exercises.tools.GenVal;

import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int[] arr = new int[20];
        int tmp;

        // Populating the array
        for(int i=0; i<arr.length; i++){
            arr[i] = v.genInt(0, 10);
        }
        System.out.println(Arrays.toString(arr));

        // Sorting the array
        for(int i=0; i<arr.length/2; i++){
            tmp = arr[i+10];
            arr[i+10] = arr[i];
            arr[i] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
