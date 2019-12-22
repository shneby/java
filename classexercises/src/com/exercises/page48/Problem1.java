package com.exercises.page48;

import com.exercises.tools.GenVal;

public class Problem1 {
    public static void main(String[] args) {
        GenVal v = new GenVal();

        int[] arr = new int[50];
        double avg = 0;
        double sum = 0;

        for(int i = 0; i<arr.length; i++){
            arr[i] = v.genInt(0, 10);
            sum += arr[i];
        }

        avg = sum / arr.length;
        System.out.printf("sum: %.2f%n", sum);
        System.out.printf("avg: %.2f%n", avg);

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > avg){
                System.out.printf("aboveAvg: %d%n", arr[i]);
            }
        }
    }
}
