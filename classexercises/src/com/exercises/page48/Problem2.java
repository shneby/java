package com.exercises.page48;

import com.exercises.tools.GenVal;

public class Problem2 {
    public static void main(String[] args) {
        GenVal v = new GenVal();

        int[] arr = new int[100];
        double avg = 0;
        double sum = 0;
        int evenCounter = 0;

        for(int i = 0; i<arr.length; i++){
            arr[i] = v.genInt(0, 10);
            System.out.printf("got value: %d%n", arr[i]);

            if(arr[i] % 2 == 0){
                sum += arr[i];
                evenCounter++;
            }

        }
        avg = sum / evenCounter;
        System.out.printf("even number amount: %d%n", evenCounter);
        System.out.printf("sum of even numbers: %.2f%n", sum);
        System.out.printf("avg of even numbers: %.2f%n", avg);
    }
}
