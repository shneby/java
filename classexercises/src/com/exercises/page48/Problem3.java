package com.exercises.page48;

import com.exercises.tools.GenVal;

public class Problem3 {
    public static void main(String[] args) {
        GenVal v = new GenVal();

        int[] arr = new int[60];
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            arr[i] = v.genInt(0, 1000);
            System.out.printf("got value: %d%n", arr[i]);
            sum += arr[i];
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == (sum - arr[i])){
                System.out.printf("found %d in location %d equals the sum of all other cells", arr[i], i, sum-arr[i]);
            }
        }
    }
}
