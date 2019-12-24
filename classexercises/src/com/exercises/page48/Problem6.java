package com.exercises.page48;

import com.exercises.tools.GenVal;

import java.util.Arrays;

public class Problem6 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int[] arr = new int[20];
        int tmp;

        // Populating the array
        for(int i=0; i<arr.length; i++){
            arr[i] = v.genInt(0, 10);
        }
        System.out.println(Arrays.toString(arr));

        // Reversing the array
        for(int i=0; i<arr.length/2; i++){
            tmp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
