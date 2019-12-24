package com.exercises.page48;

import com.exercises.tools.GenVal;

import java.util.Arrays;

public class Problem5 {
    public static void main(String[] args) {
        GenVal v = new GenVal();
        int[] arr = new int[60];
        int tmp;
        boolean swapOccurred = true;

        // Populating the array
        for(int i=0; i<arr.length; i++){
            arr[i] = v.genInt(0, 10);
        }
        System.out.println(Arrays.toString(arr));

        // Sorting the array
        while(swapOccurred){
            swapOccurred = false;
            for(int i=1; i<arr.length; i++){
                if(arr[i] % 2 == 0 && arr[i-1] % 2 != 0){
                    tmp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = tmp;
                    swapOccurred = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
